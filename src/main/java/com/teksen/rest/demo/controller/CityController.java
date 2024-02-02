package com.teksen.rest.demo.controller;

import com.teksen.rest.demo.model.City;
import com.teksen.rest.demo.response.ResponseHandler;
import com.teksen.rest.demo.service.CityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cities")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("{cityName}")
    public ResponseEntity<Object> findCityByCityName(@PathVariable("cityName") String cityName){
        return ResponseHandler.responseBuilder("Request City Details are given here", HttpStatus.OK, cityService.readCity(cityName));
    }

    @GetMapping
    public List<City> findAllCities(){
        return cityService.readAllCities();
    }

    @PostMapping
    public String createCity(@RequestBody City city){
        return cityService.createCity(city);
    }

    @PutMapping
    public String updateCity(@RequestBody City city){
        return cityService.updateCity(city);
    }

    @DeleteMapping("{cityName}")
    public String deleteCity(@PathVariable("cityName") String cityName){
        return cityService.deleteCity(cityName);
    }
}
