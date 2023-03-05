package com.miskevich.service.city;

import com.miskevich.domain.City;
import com.miskevich.repository.CityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CityServiceIpl implements CityService{

   private final CityRepository cityRepository;

    @Override
    @Transactional
    public City create(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City findCityByCityName(String cityName) {
        return cityRepository.findCityByCityName(cityName);
    }

    @Override
    @Transactional
    public City update(City city) {
        return cityRepository.save(city);
    }

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        cityRepository.deleteById(id);
    }


}
