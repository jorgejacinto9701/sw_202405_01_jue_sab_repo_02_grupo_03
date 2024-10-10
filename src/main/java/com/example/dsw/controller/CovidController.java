package com.example.dsw.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.dsw.entity.Covid;
import com.example.dsw.service.CovidService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

    

}



