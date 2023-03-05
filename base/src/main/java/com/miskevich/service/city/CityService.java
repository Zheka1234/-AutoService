package com.miskevich.service.city;

import com.miskevich.domain.City;

import java.util.List;

public interface CityService {

    City create(City city);

    City findCityByCityName(String cityName);

    City update(City city);

    List<City> findAll();

    void delete(Integer id);


}
