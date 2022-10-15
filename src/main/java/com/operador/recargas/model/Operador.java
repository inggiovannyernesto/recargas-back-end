package com.operador.recargas.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "operadores")
public class Operador {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @JsonIgnore
    @OneToMany(mappedBy = "operador")
    private List<Recarga> recarga;



    public Operador(Integer id, String nombre, List<Recarga> recarga) {
        this.id = id;
        this.nombre = nombre;
        this.recarga = recarga;
    }
    public Operador() {
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Recarga> getRecarga() {
        return recarga;
    }
    public void setRecarga(List<Recarga> recarga) {
        this.recarga = recarga;
    }


    
}
