package com.spring_boot.Cafeteria.Controlador;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class cafeControlador {
    @GetMapping("/Izquierda")

    public String Izquierda() {
        return "/left-slidebar";
    }

    @GetMapping("/Derecha")
    public String Derecha() {
        return "/rigth-slidebar";
    }

    @GetMapping("/medio")
    public String Medio() {
        return "/no-sidebar";
    }

    @GetMapping ("Home")
    public String Home() {
        return "/Index";
    }
}
