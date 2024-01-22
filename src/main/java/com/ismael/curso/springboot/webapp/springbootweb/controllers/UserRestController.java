package com.ismael.curso.springboot.webapp.springbootweb.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.ismael.curso.springboot.webapp.springbootweb.models.*;
import com.ismael.curso.springboot.webapp.springbootweb.models.dto.UserDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController 
@RequestMapping("/api")
public class UserRestController {
    
    @GetMapping("/details")
    public UserDto details(){
        user user = new user("Ismael", "Bergara");
        UserDto userDto = new UserDto();
        
        userDto.setUser(user);
        userDto.setTitle("Hola mundo Spring Boot");
        return userDto;
    }

    @GetMapping("/list")
    public List<user> list(){
        user user = new user("Ismael", "Bergara");
        user user1 = new user("Facundo", "Recagno");
        user user2 = new user("Lucio", "Schiavoni");
        user user3 = new user("Gonzalo", "Bonino");
        List<user> users = Arrays.asList(user,user1,user2,user3);
      

        //  users.add(user);    
       // users.add(user1);    
        //users.add(user2);    
        //users.add(user3);
        
        return users;    
    }
    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(){

        user user = new user("Ismael", "Bergara");
        
        Map<String, Object> body = new HashMap<>();
        body.put("Title", "Hola Mundo Spring Boot");
        body.put("User", user);
        return body;
    }
}
