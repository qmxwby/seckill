package org.wby.seckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

    /**
     * 功能描述：测试页面跳转
     * @param model
     * @return
     */
    @RequestMapping("/hello")
    public String Hello(Model model) {
        model.addAttribute("name", "wby");
        return "hello";
    }
}
