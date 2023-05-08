package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/prueba")
public class Controller {

    @GetMapping
    public String helloworld(){
        return "<h1> Hello world </h1>";
    }
}
