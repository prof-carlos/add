package com.example.aula.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @RequestMapping("/")
    public String welcome(){
        return "Bem-vindo ao projeto!";
    }
}



