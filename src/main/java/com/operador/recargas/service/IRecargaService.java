package com.operador.recargas.service;

import java.util.List;
import com.operador.recargas.model.Recarga;

public interface IRecargaService {
    Recarga save(Recarga recarga);
    List <Recarga> get();
    List <Recarga> getParameter(Integer id);
    
}
