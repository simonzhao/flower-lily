package cn.messycode.flower.lily;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/checkpreload.html")
    public @ResponseBody String checkPreload(){
        return "success";
    }
}
