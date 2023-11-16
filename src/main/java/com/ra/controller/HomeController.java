package com.ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
    @RequestMapping("/home")
    public String home(Model model ){
        String name = "Dungx";
        model.addAttribute("name",name);

        return "home";
    }
}
