package com.gvfs.gfood.domain.repository;

import com.gvfs.gfood.domain.model.City;

import java.util.List;

public interface CityRepository {

    List<City> findAll();

    City findById(Long id);
    City save(City city);
    void remove(City city);

}
