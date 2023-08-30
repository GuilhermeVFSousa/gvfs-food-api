package com.gvfs.gfood.infrastructure.repository;

import com.gvfs.gfood.domain.model.Kitchen;
import com.gvfs.gfood.domain.repository.KitchenRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class KitchenRepositoryImpl implements KitchenRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Kitchen> findAll() {
        return manager.createQuery("from Kitchen", Kitchen.class)
                .getResultList();
    }

    @Override
    public Kitchen findById(Long id) {
        return manager.find(Kitchen.class, id);
    }

    @Transactional
    @Override
    public Kitchen save(Kitchen kitchen) {
        return manager.merge(kitchen);
    }

    @Transactional
    @Override
    public void remove(Kitchen kitchen) {
        kitchen = findById(kitchen.getId());
        manager.remove(kitchen);
    }
}
