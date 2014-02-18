package com.thoughtworks;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "helloworld";
    }

    @RequestMapping("/1")
    public String sayHelloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "helloworld";
    }
}
