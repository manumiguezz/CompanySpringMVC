package com.manumiguezz.springboot.EmployeeThymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringMVCController {

    @GetMapping("/date")
    public String htmlModel(Model theModel) {
        theModel.addAttribute("theDate", new java.util.Date());
        return "htmlModel";
    }
}
