package com.ismael.curso.springboot.webapp.springbootweb.controllers;

import com.ismael.curso.springboot.webapp.springbootweb.models.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;





@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details(Model model){
        
        user user = new user("Ismael", "Bergara");
        user.setEmail("isbergara1@gmail.com");
        model.addAttribute("title", "Hola Mundo SpringBoot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
       // model.addAttribute("users", users);
        model.addAttribute("title", "Listado de Usuarios");
        return "list";
    }

   @ModelAttribute("users")
    public List<user> usersModel(){
        return Arrays.asList(
            new user("Ismael", "Bergara", "isbergara1@gmail.com"),
            new user("Facundo", "Recagno", "facundoezequiel459@gmail.com"),
            new user("Nicolas", "Cabrera", "nicolas.cabrera@mec.gub.uy"));
            
    }
    
}
