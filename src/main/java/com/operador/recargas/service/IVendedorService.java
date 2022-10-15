package com.operador.recargas.service;

import java.util.List;

import com.operador.recargas.model.Vendedor;

public interface IVendedorService {
    Vendedor save(Vendedor cliente);
    List <Vendedor> get();
    Vendedor search(String cedula);
}
