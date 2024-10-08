package com.example.dsw.service;

import java.util.List;

import com.example.dsw.entity.Pais;


public interface PaisService {
    public abstract List<Pais> listaporPaisPopularidada(String region, Long population);
    List<Pais> listaInPorArea(List<Double> area);
}
