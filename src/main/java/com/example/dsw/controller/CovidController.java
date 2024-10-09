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
    private CovidService service;

    @GetMapping("/listaPorMesPais/{month}/{countryterritoryCode}")
    public List<Covid> listaPorMesPais(@PathVariable String month,@PathVariable String countryterritoryCode){
        return service.listaPorMesPais(month, countryterritoryCode);
    }

    @DeleteMapping("/eliminaPorMuertesPais/{deaths}/{countryterritoryCode}")
    public void eliminaPorMuertesPais(@PathVariable Integer deaths,@PathVariable String countryterritoryCode){
        service.eliminaPorMuertesPais(deaths, countryterritoryCode);
    }

}
