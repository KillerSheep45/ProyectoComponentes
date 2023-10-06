package com.proyectofinal.proyectofinalcomponentes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Proyecto Componentes Matias Brayle Daniel. Hola profe!";
    }
}
