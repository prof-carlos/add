package com.example.atividade.repository;

import com.example.atividade.model.Cliente;
import com.example.atividade.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
