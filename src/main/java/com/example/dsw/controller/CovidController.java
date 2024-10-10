package com.example.dsw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dsw.entity.Covid;
import com.example.dsw.service.CovidService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/url/covid")
public class CovidController {
    
    @Autowired
    private CovidService covidService;

    @GetMapping("/buscarPorCountry/{country}")
	    public List<Covid> buscarPorCountry(@PathVariable  String country) {
	        return covidService.buscarPorCountry(country);
	    }

    @GetMapping("/listaMayorDeaths/{deaths}")
	    public List<Covid> listaMayorDeaths(@PathVariable Integer deaths) {
	        return covidService.listaMayorDeaths(deaths);
	}

    @GetMapping("/listaPorMesOAño/{month}/{year}")
        public List<Covid> listaPorMesOAño(@PathVariable String month, @PathVariable String year) {
        return covidService.listaPorMesOAño(month, year);
    }

    @GetMapping("/listaPorDiaYAño/{day}/{year}")
        public List<Covid> listaPorDiaYAño(@PathVariable String day, @PathVariable String year) {
        return covidService.listaPorDíaYAño(day, year);
    }

    @GetMapping("/listaPorMesPais/{month}/{countryterritoryCode}")
    public List<Covid> listaPorMesPais(@PathVariable String month,@PathVariable String countryterritoryCode){
        return covidService.listaPorMesPais(month, countryterritoryCode);
    }

    @DeleteMapping("/eliminaPorMuertesPais/{deaths}/{countryterritoryCode}")
    public void eliminaPorMuertesPais(@PathVariable Integer deaths,@PathVariable String countryterritoryCode){
        covidService.eliminaPorMuertesPais(deaths, countryterritoryCode);
    }

}

