package com.ismael.curso.springboot.webapp.springbootweb.models;

public class user {
    private String name;
    private String lastName;
    private String email;
    
    public user(){  
    }
    public user(String name, String lastname, String email){
        this(name, lastname);
        this.email = email;
    }
    public user(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
