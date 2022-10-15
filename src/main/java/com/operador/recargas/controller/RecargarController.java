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
import com.operador.recargas.model.Recarga;
import com.operador.recargas.service.IRecargaService;

@RestController
@RequestMapping("/recarga")
@CrossOrigin(origins = "http://localhost:4200")
public class RecargarController {
    @Autowired
    private IRecargaService service;


    @PostMapping("/crear")
    public Recarga save(@RequestBody Recarga recarga) {
        return service.save(recarga);
    }


    @GetMapping("/all")
    public List<Recarga> get() {
        return service.get();
    }

    @GetMapping("/allParameter")
    public List<Recarga> getParameter(@RequestParam("id") String id) {
        if( "null".equals(id) || id == null){
            return service.get();
        }
        return service.getParameter(new Integer (id));
    }
}
