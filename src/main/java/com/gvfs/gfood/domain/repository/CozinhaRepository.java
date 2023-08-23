package com.gvfs.gfood.domain.repository;

import com.gvfs.gfood.domain.model.Cozinha;

import java.util.List;

public interface CozinhaRepository {

    List<Cozinha> listar();

    Cozinha buscar (Long id);
    Cozinha salvar(Cozinha cozinha);
    void remover(Cozinha cozinha);

}