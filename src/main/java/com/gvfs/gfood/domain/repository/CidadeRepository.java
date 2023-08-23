package com.gvfs.gfood.domain.repository;

import com.gvfs.gfood.domain.model.Cidade;

import java.util.List;

public interface CidadeRepository {

    List<Cidade> listar();

    Cidade buscar (Long id);
    Cidade salvar(Cidade cidade);
    void remover(Cidade cidade);

}
