package cn.messycode.flower.lily;

import cn.messycode.flower.lily.api.LilyService;
import cn.messycode.flower.lily.api.dto.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.lang.reflect.Method;

/**
 * @author simon.zhao
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {
    @Autowired
    private ApplicationContext context;

    @Resource
    private LilyService lilyServiceImpl;

    @GetMapping("/get.html")
    public ResponseDTO get(){
        return lilyServiceImpl.getServiceList(null);
    }

    @GetMapping("/bean.html")
    public ResponseDTO bean(){
        ResponseDTO dto = new ResponseDTO();
        String[] beanNames = context.getBeanDefinitionNames();
        for(String beanName : beanNames){
            log.info("beanName:[{}]", beanName);
        }
        dto.setData(beanNames);
        return dto;
    }

    @GetMapping("/test1")
    public ResponseDTO test1(){
        Object object = context.getBean("lilyServiceImpl");
        Method method = ReflectionUtils.findMethod(object.getClass(), "getId");
        log.info("method:[{}]", method.getName());

        Object o = ReflectionUtils.invokeMethod(method, object);
        log.info("result:[{}]", o);

        ResponseDTO dto = new ResponseDTO();
        dto.setData(o);
        return dto;
    }
}
