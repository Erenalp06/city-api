package com.teksen.rest.demo.service;


import com.teksen.rest.demo.model.City;

import java.util.List;

public interface CityService {

    String createCity(City city);
    String updateCity(City city);
    City readCity(String cityNameToFind);
    List<City> readAllCities();
    String deleteCity(String cityNameToDelete);
}
