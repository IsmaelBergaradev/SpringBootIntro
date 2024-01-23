package com.ismael.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {

    @GetMapping({"", "/", "/home", "/error", "/hola"})
    public String home() {
        return "redirect:/details";
    }
    
}
