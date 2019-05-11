package cn.messycode.flower.lily;

import cn.messycode.flower.lily.api.LilyService;
import cn.messycode.flower.lily.api.dto.ResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author simon.zhao
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private LilyService lilyServiceImpl;

    @GetMapping("/get.html")
    public ResponseDTO get(){
        return lilyServiceImpl.getServiceList(null);
    }

}
