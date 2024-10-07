package com.example.dsw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dsw.entity.Pelicula;
import com.example.dsw.service.PeliculaService;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/url/pelicula")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @GetMapping("/listaporPaisOGenero/{country}/{genre}")
    public List<Pelicula> listaporPaisOGenero(@PathVariable String country, @PathVariable String genre) {
        return peliculaService.listaporPaisOGenero(country, genre);
    }

    @GetMapping("/buscarPeliculaEntreAnos/{anoInicio}/{anoFinal}")
    public List<Pelicula> buscarPeliculaEntreAnos(@PathVariable Integer anoInicio, @PathVariable Integer anoFinal) {
        return peliculaService.buscarPeliculaEntreAnos(anoInicio, anoFinal);
    }
}
