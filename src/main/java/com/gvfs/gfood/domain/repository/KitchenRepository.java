package com.gvfs.gfood.domain.repository;

import com.gvfs.gfood.domain.model.Kitchen;

import java.util.List;

public interface KitchenRepository {

    List<Kitchen> findAll();

    Kitchen findById(Long id);
    Kitchen save(Kitchen kitchen);
    void remove(Kitchen kitchen);

}
