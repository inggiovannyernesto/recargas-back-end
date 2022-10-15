package com.operador.recargas.service.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.operador.recargas.model.Recarga;
import com.operador.recargas.repo.IRecargaRepo;
import com.operador.recargas.service.IRecargaService;

@Service
public class RecargaServiceImpl implements IRecargaService{
    @Autowired
    private IRecargaRepo data;
    @Override
    public Recarga save(Recarga recarga) {
        return data.save(recarga);
    }    

    public List<Recarga> get(){
        return data.findAll();
    }

    @Override
    public List<Recarga> getParameter(Integer id) {        
        return data.search(id);
    }

 
}
