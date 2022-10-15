package com.operador.recargas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.operador.recargas.model.Vendedor;
import com.operador.recargas.service.IVendedorService;


@RestController
@RequestMapping("/vendedor")
@CrossOrigin(origins = "http://localhost:4200")
public class VendedorController {
    @Autowired
    private IVendedorService service;


    @PostMapping("/crear")
    public Vendedor save(@RequestBody Vendedor vendedor) {
        return service.save(vendedor);
    }


    @GetMapping("/all")
    public List<Vendedor> get() {
        return service.get();
    }

    @GetMapping("/search")
    public Vendedor search(  @RequestParam(value = "cedula", required = true) String cedula) {
        return service.search(cedula);
    }
}
