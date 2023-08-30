package com.gvfs.gfood.domain.repository;

import com.gvfs.gfood.domain.model.State;

import java.util.List;

public interface StateRepository {

    List<State> findAll();

    State findById(Long id);
    State save(State state);
    void remove(State state);

}
