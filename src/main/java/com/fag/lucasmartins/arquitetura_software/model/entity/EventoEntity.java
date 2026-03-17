package com.fag.lucasmartins.arquitetura_software.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_eventos")
public class EventoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Integer capacidadeMaxima;

    private Integer ingressosVendidos;

    public EventoEntity() {
    }

    public EventoEntity(Long id, String nome, Integer capacidadeMaxima, Integer ingressosVendidos) {
        this.id = id;
        this.nome = nome;
        this.capacidadeMaxima = capacidadeMaxima;
        this.ingressosVendidos = ingressosVendidos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(Integer capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public Integer getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(Integer ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

}