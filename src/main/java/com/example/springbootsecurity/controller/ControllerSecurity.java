package com.example.springbootsecurity.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSecurity {

    @GetMapping("/")
    public String home() {
        return "<h2>Hello World</h2>";
    }
    @GetMapping("/user")
    public String user() {
        return "<h2>Hello User</h2>";
    }
    @GetMapping("/admin")
    public String admin() {
        return "<h2>Hello Admin</h2>";
    }

}
