package cn.messycode.flower.lily;

import cn.messycode.flower.lily.api.LilyService;
import cn.messycode.flower.lily.api.dto.ResponseDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author simon
 */
@Controller
public class MainController {


    @GetMapping("/checkpreload.html")
    public @ResponseBody String checkPreload(){
        return "success";
    }
}
