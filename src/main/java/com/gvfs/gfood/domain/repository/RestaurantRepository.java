package com.gvfs.gfood.domain.repository;

import com.gvfs.gfood.domain.model.Restaurant;

import java.util.List;

public interface RestaurantRepository {

    List<Restaurant> findAll();

    Restaurant findById(Long id);
    Restaurant save(Restaurant restaurant);
    void remove(Restaurant restaurant);

}
