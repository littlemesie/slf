package cn.mesie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 2018/7/13 10:24 PM
 *
 * @author: mesie
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("now","2018-7-13");
        return "hello";
    }
}
