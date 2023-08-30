package com.gvfs.gfood.infrastructure.repository;

import com.gvfs.gfood.domain.model.Permission;
import com.gvfs.gfood.domain.repository.PermissionRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PermissionRepositoryImpl implements PermissionRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Permission> findAll() {
        return manager.createQuery("from Permission", Permission.class)
                .getResultList();
    }

    @Override
    public Permission findById(Long id) {
        return manager.find(Permission.class, id);
    }

    @Transactional
    @Override
    public Permission save(Permission permission) {
        return manager.merge(permission);
    }

    @Transactional
    @Override
    public void remove(Permission permission) {
        permission = findById(permission.getId());
        manager.remove(permission);
    }
}
