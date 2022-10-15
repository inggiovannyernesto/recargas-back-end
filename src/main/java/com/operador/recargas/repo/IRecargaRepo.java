package com.operador.recargas.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.operador.recargas.model.Recarga;

@Repository("recargas")
public interface IRecargaRepo extends JpaRepository<Recarga,Integer> {


    @Query(value="SELECT * FROM recargas where id_operador=?", nativeQuery = true) 
    public List<Recarga> search(Integer id);
}
