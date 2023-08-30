package com.gvfs.gfood.jpa;

import com.gvfs.gfood.domain.model.Kitchen;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CadastroCozinha {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Kitchen> listar() {
        return entityManager.createQuery("FROM Kitchen", Kitchen.class)
                .getResultList();
    }

    @Transactional
    public Kitchen adicionar(Kitchen kitchen) {
        return entityManager.merge(kitchen);
    }
}
