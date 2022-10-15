package com.operador.recargas.service;

import java.util.List;
import com.operador.recargas.model.Operador;

public interface IOperadorService {
    Operador save(Operador cliente);
    List <Operador> get();
}
