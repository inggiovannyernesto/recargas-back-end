package com.operador.recargas.service.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operador.recargas.model.Vendedor;
import com.operador.recargas.repo.IVendedorRepo;
import com.operador.recargas.service.IVendedorService;

@Service
public class VendedorServiceImpl implements IVendedorService{
    @Autowired
    private IVendedorRepo data;
    @Override
    public Vendedor save(Vendedor vendedor) {
        return data.save(vendedor);
    }    

    public List<Vendedor> get(){
        return data.findAll();
    }

    public   Vendedor search(String cedula){
        return data.search(cedula);
    }
}
