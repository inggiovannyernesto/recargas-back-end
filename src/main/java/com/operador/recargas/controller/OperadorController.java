package com.operador.recargas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.operador.recargas.model.Operador;
import com.operador.recargas.service.IOperadorService;


@RestController
@RequestMapping("/operador")
@CrossOrigin(origins = "http://localhost:4200")
public class OperadorController {
    @Autowired
    private IOperadorService service;


    @PostMapping("/crear")
    public Operador save(@RequestBody Operador operador) {
        return service.save(operador);
    }


    @GetMapping("/all")
    public List<Operador> get() {
        return service.get();
    }

 
}
