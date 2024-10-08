package com.example.dsw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dsw.entity.Pais;

import com.example.dsw.repository.PaisRepository;

@Service
public class PaisServiceImpl implements PaisService{
    @Autowired
    private PaisRepository paisRepository;
    @Override
    public List<Pais> listaporPaisPopularidada(String region, Long population) {
        return paisRepository.listaporPaisPopularidada(region, population);
    }
    @Override
    public List<Pais> listaInPorArea(List<Double> area) {
        return paisRepository.listaInPorArea(area);
    }
}
