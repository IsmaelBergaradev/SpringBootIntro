package com.ismael.curso.springboot.webapp.springbootweb.models.dto;

import com.ismael.curso.springboot.webapp.springbootweb.models.user; 

public class UserDto {
    private String title;
    private user user;

   
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public user getUser() {
        return user;
    }
    public void setUser(user user) {
        this.user = user;
    }

}
