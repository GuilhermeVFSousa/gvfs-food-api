package com.gvfs.gfood.infrastructure.repository;

import com.gvfs.gfood.domain.model.City;
import com.gvfs.gfood.domain.repository.CityRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CityRepositoryImpl implements CityRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<City> findAll() {
        return manager.createQuery("from City", City.class)
                .getResultList();
    }

    @Override
    public City findById(Long id) {
        return manager.find(City.class, id);
    }

    @Transactional
    @Override
    public City save(City city) {
        return manager.merge(city);
    }

    @Transactional
    @Override
    public void remove(City city) {
        city = findById(city.getId());
        manager.remove(city);
    }
}
