package com.app.bar.appbar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class categoriacontroller {

    @GetMapping("/categoria")
    public String Consulta(){

        return null;
    }
}
