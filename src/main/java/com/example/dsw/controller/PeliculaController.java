package com.example.dsw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.dsw.entity.Pelicula;
import com.example.dsw.service.PeliculaService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/url/pelicula")
public class PeliculaController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/listaporPaisOGenero/{country}/{genre}")
    public List<Pelicula> listaporPaisOGenero(@PathVariable String country, @PathVariable String genre) {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Pelicula", null, String.class);
        return peliculaService.listaporPaisOGenero(country, genre);
    }

    @GetMapping("/buscarPeliculaEntreAnos/{anoInicio}/{anoFinal}")
    public List<Pelicula> buscarPeliculaEntreAnos(@PathVariable Integer anoInicio, @PathVariable Integer anoFinal) {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Pelicula", null, String.class);
        return peliculaService.buscarPeliculaEntreAnos(anoInicio, anoFinal);
    }
}
