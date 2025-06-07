package com.example.ShSys.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class homeController {
    @RequestMapping("/home/api")
    public String home() {
        return "home";
    }
}
