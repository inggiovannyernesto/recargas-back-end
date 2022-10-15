package com.operador.recargas.service.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.operador.recargas.model.Operador;
import com.operador.recargas.repo.IOperadorRepo;
import com.operador.recargas.service.IOperadorService;

@Service
public class OperadorServiceImpl implements IOperadorService{
    @Autowired
    private IOperadorRepo data;
    @Override
    public Operador save(Operador operador) {
        return data.save(operador);
    }    

    public List<Operador> get(){
        return data.findAll();
    }

 
}
