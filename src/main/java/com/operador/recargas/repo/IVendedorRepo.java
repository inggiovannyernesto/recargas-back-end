package com.operador.recargas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.operador.recargas.model.Vendedor;

@Repository("vendedores")
public interface IVendedorRepo extends JpaRepository<Vendedor,Integer> {
    @Query(value="SELECT * FROM vendedores where nombre=?", nativeQuery = true) 
    public Vendedor search(String cedula);
}
