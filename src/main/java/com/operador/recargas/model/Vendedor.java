package com.operador.recargas.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "vendedores")
public class Vendedor {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "celular", nullable = false)
    private String celular;
    @Column(name = "cedula", nullable = false)
    private String cedula;
    @JsonIgnore
    @OneToMany(mappedBy = "vendedor")
    private List<Recarga> recarga;

   

    public Vendedor(Integer id, String nombre, String celular, String cedula, List<Recarga> recarga) {
        this.id = id;
        this.nombre = nombre;
        this.celular = celular;
        this.cedula = cedula;
        this.recarga = recarga;
    }
    public Vendedor() {
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
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }



    
}
