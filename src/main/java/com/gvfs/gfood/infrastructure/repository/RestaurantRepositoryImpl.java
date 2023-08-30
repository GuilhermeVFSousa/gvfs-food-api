package com.gvfs.gfood.infrastructure.repository;

import com.gvfs.gfood.domain.model.Restaurant;
import com.gvfs.gfood.domain.repository.RestaurantRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RestaurantRepositoryImpl implements RestaurantRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<Restaurant> findAll() {
        return manager.createQuery("from Restaurant", Restaurant.class)
                .getResultList();
    }

    @Override
    public Restaurant findById(Long id) {
        return manager.find(Restaurant.class, id);
    }

    @Transactional
    @Override
    public Restaurant save(Restaurant restaurant) {
        return manager.merge(restaurant);
    }

    @Transactional
    @Override
    public void remove(Restaurant restaurant) {
        restaurant = findById(restaurant.getId());
        manager.remove(restaurant);
    }
}
