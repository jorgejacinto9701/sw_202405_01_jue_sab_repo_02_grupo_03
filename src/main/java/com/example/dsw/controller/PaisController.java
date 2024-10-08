package com.example.dsw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dsw.entity.Pais;
import com.example.dsw.service.PaisService;

@RestController
@RequestMapping("/url/pais")
public class PaisController {
     @Autowired
    private PaisService paisService;

    @GetMapping("/listaporPaisPopularidada/{region}/{population}")
    public List<Pais> listaporPaisPopularidada(@PathVariable String region, @PathVariable Long population) {
        return paisService.listaporPaisPopularidada(region, population);
    }
    @GetMapping("/listaInPorArea/{area}")
    public List<Pais> listaInPorArea(@PathVariable List<Double> area) {
        return paisService.listaInPorArea(area);
    }
}
