package com.gvfs.gfood.domain.repository;

import com.gvfs.gfood.domain.model.Estado;

import java.util.List;

public interface EstadoRepository {

    List<Estado> listar();

    Estado buscar (Long id);
    Estado salvar(Estado estado);
    void remover(Estado estado);

}