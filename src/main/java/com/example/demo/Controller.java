package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/prueba")
public class Controller {

    Logger log = LoggerFactory.getLogger(Controller.class);

    @GetMapping
    public String helloworld(){
        return "<h1> Hello world </h1>";
    }

    @PostMapping(value = "/saludo")
    @CrossOrigin
    public ResponseEntity<String> helloworld(@RequestBody String mensaje){
        String saludo  = mensaje;
        log.info("El mensaje es : " + mensaje);
        return ResponseEntity.ok("Mensaje asignado  " + saludo);
    }
}
