package com.teksen.rest.demo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cities")
public class City {

    @Id
    @Column(name = "city_name")
    private String cityName;

    @Column(name = "plate_code")
    private int plateCode;

    @Column(name = "phone_code")
    private int phoneCode;

    @ElementCollection
    @CollectionTable(name = "city_districts", joinColumns = @JoinColumn(name = "city_name"))
    @Column(name = "district")

    private List<String> districts;
    @Column(name = "region")
    private String region;

    public City() {
    }

    public City(String cityName, int plateCode, int phoneCode, List<String> districts, String region) {
        this.cityName = cityName;
        this.plateCode = plateCode;
        this.phoneCode = phoneCode;
        this.districts = districts;
        this.region = region;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPlateCode() {
        return plateCode;
    }

    public void setPlateCode(int plateCode) {
        this.plateCode = plateCode;
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }

    public List<String> getDistricts() {
        return districts;
    }

    public void setDistricts(List<String> districts) {
        this.districts = districts;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
