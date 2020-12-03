package com.app.bar.appbar.controller;

import com.app.bar.appbar.repository.entity.Tienda;
import com.app.bar.appbar.service.ItiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class tiendacontroller {

    @Autowired
    ItiendaService itiendaService;

    @GetMapping("/tienda")
    public List<Tienda> Consulta(){

        return itiendaService.findall();
    }
}
