package com.ejemplo.autenticacion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login"; // login.html en templates
    }

    @GetMapping("/")
    public String home() {
        return "index"; // index.html en templates
    }
}

