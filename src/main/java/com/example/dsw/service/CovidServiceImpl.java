package com.example.dsw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dsw.entity.Covid;
import com.example.dsw.repository.CovidRepository;

@Service
public class CovidServiceImpl implements CovidService {
    
    @Autowired
    private CovidRepository covidRepository;

    @Override
    public List<Covid> listaMayorDeaths(Integer deaths) {
        return covidRepository.listaMayorDeaths(deaths);
    }

    @Override
    public List<Covid> listaPorMesOAño(String month, String year) {
        return covidRepository.listaPorMesOAño(month, year);
    }

    @Override
    public List<Covid> buscarPorCountry(String country) {
        return covidRepository.buscarPorCountry(country);
          }

    @Override
    public List<Covid> listaPorDíaYAño(String day, String year) {
        return covidRepository.listaPorMesOAño(day, year);
    }
    

}
