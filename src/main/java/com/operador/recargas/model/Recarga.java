package com.operador.recargas.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "recargas")
public class Recarga {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "celular", nullable = false)
    private String celular;
    
    @Column(name = "valor", nullable = false)
    private Long valor;

    @ManyToOne()
    @JoinColumn(name = "id_vendedor")
    private Vendedor vendedor;

    @ManyToOne()
    @JoinColumn(name = "id_operador")
    private Operador operador;
 
    public Recarga(Integer id, String celular, Long valor, Vendedor vendedor, Operador operador) {
        this.id = id;
        this.celular = celular;
        this.valor = valor;
        this.vendedor = vendedor;
        this.operador = operador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public Recarga() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }


   
    
}
