package com.facens.ac2b.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // define que a classe é um controlador REST
@RequestMapping("/model") // define o caminho raiz para acessar a classe
public class ModelController {

    @GetMapping("/find") // define o sub-caminho para acessar o metodo
    public String get() {
        return "Professor";
    }
}
