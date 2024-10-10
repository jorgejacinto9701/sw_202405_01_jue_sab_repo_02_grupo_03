package com.example.dsw.service;

import java.util.List;
import com.example.dsw.entity.Covid;

public interface CovidService {
    	public abstract List<Covid> buscarPorCountry(String country);
        public abstract List<Covid> listaMayorDeaths(Integer deaths);
        public abstract List<Covid> listaPorMesOAño(String month, String year);
        public abstract List<Covid> listaPorDíaYAño(String day, String year);

    public abstract List<Covid> listaPorMesPais(String month,String countryterritoryCode);
    public void eliminaPorMuertesPais(Integer deaths, String countryterritoryCode);

}
