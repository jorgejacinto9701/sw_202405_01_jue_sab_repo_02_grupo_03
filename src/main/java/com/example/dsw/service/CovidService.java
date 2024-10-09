package com.example.dsw.service;

import java.util.List;

import com.example.dsw.entity.Covid;

public interface CovidService {

    public abstract List<Covid> listaPorMesPais(String month,String countryterritoryCode);
    public void eliminaPorMuertesPais(Integer deaths, String countryterritoryCode);

}
