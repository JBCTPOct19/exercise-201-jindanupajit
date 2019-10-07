package com.jindanupajit.javabootcamp.exercise2011;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @RequestMapping("/")
    public String homePage() {
        return "index";
    }

    @RequestMapping("/process")
    public String processForm(@RequestParam("email") String email, Model model) {
        model.addAttribute("email", email);
        return "index";
    }
}

