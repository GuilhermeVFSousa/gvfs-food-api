package com.gvfs.gfood.domain.repository;

import com.gvfs.gfood.domain.model.Cozinha;
import com.gvfs.gfood.domain.model.Restaurante;

import java.util.List;

public interface RestauranteRepository {

    List<Restaurante> listar();

    Restaurante buscar (Long id);
    Restaurante salvar(Restaurante restaurante);
    void remover(Restaurante restaurante);

}
