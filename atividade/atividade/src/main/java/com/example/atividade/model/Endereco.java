package com.example.atividade.model;

import jakarta.persistence.*;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "endereco_id")
    private Long id;

    @Column(nullable = false)
    private String logradouro;
    private String numero;

    public Endereco() {
    }

    public Endereco(Long id, String logradouro, String numero) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
