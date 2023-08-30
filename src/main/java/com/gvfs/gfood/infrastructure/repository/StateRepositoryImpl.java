package com.gvfs.gfood.infrastructure.repository;

import com.gvfs.gfood.domain.model.State;
import com.gvfs.gfood.domain.repository.StateRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class StateRepositoryImpl implements StateRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<State> findAll() {
        return manager.createQuery("from State", State.class)
                .getResultList();
    }

    @Override
    public State findById(Long id) {
        return manager.find(State.class, id);
    }

    @Transactional
    @Override
    public State save(State state) {
        return manager.merge(state);
    }

    @Transactional
    @Override
    public void remove(State state) {
        state = findById(state.getId());
        manager.remove(state);
    }
}
