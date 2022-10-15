package com.operador.recargas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.operador.recargas.model.Operador;

@Repository("operadores")
public interface IOperadorRepo extends JpaRepository<Operador,Integer> {

}
