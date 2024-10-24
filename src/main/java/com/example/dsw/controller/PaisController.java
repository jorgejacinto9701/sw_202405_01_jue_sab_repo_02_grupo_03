package com.example.dsw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.dsw.entity.Pais;
import com.example.dsw.service.PaisService;

@RestController
@RequestMapping("/url/pais")
public class PaisController {
     @Autowired
    private PaisService paisService;

    @Autowired
    private RestTemplate restTemplate;

    // @GetMapping("/listaporPaisPopularidada/{region}/{population}")
    // public List<Pais> listaporPaisPopularidadat3(@PathVariable String region, @PathVariable Long population) {
    //     return paisService.listaporPaisPopularidada(region, population);
    // }
    // @GetMapping("/listaInPorArea/{area}")
    // public List<Pais> listaInPorAreaT3(@PathVariable List<Double> area) {
    //     return paisService.listaInPorArea(area);
    // }


    @GetMapping("/listaporPaisPopularidada/{region}/{population}")
    public List<Pais> listaporPaisPopularidadaEF(@PathVariable String region, @PathVariable Long population) {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Pais-listaporPaisPopularidada", null, String.class);        
        return paisService.listaporPaisPopularidada(region, population);
    }
    @GetMapping("/listaInPorArea/{area}")
    public List<Pais> listaInPorAreaEF(@PathVariable List<Double> area) {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Pais-listaInPorArea", null, String.class);        
        return paisService.listaInPorArea(area);
    }

}
