package com.example.aula.service;

import com.example.aula.model.UsuarioEntity;
import com.example.aula.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Create
    public UsuarioEntity salvar(UsuarioEntity usuario) {
        return usuarioRepository.save(usuario);
    }

    // Read
    public List<UsuarioEntity> listarTodos() {
        return usuarioRepository.findAll();
    }

    // Update
    public UsuarioEntity atualizar(UsuarioEntity usuario) {
        if (usuario.getId() != null && usuarioRepository.existsById(usuario.getId())) {
            return usuarioRepository.save(usuario);
        } else {
            throw new RuntimeException("Usuario não encontrado.");
        }
    }

    // Delete
    public void deletar(Long id) {
        if (usuarioRepository.existsById(id)){
            usuarioRepository.deleteById(id);
        } else {
            throw new RuntimeException("Usuário não encontrado.");
        }
    }


}
