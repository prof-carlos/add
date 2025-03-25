package com.example.atividade.model;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    private String telefone;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String telefone, Sexo sexo, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.sexo = sexo;
        this.endereco = endereco;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo.getTexto();
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", sexo=" + sexo +
                ", endereco=" + endereco +
                '}';
    }
}
