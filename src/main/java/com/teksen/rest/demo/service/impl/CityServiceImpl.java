package com.teksen.rest.demo.service.impl;

import com.teksen.rest.demo.exception.CityNotFoundException;
import com.teksen.rest.demo.model.City;
import com.teksen.rest.demo.repository.CityRepository;
import com.teksen.rest.demo.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public String createCity(City city) {
        cityRepository.save(city);
        return "City created successfully";
    }

    @Override
    public String updateCity(City city) {
        cityRepository.save(city);
        return "City created successfully";
    }

    @Override
    public City readCity(String cityNameToFind) {
        return cityRepository.findById(cityNameToFind).orElseThrow(() -> new CityNotFoundException("City does not exist!"));
    }

    @Override
    public List<City> readAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public String deleteCity(String cityNameToDelete) {
        cityRepository.deleteById(cityNameToDelete);
        return "City deleted successfully";
    }
}
