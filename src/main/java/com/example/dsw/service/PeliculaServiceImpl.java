package com.example.dsw.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dsw.entity.Pelicula;
import com.example.dsw.repository.PeliculaRepository;

@Service
public class PeliculaServiceImpl implements PeliculaService {

    @Autowired
    private PeliculaRepository peliculaRepository;

    @Override
    public List<Pelicula> listaporPaisOGenero(String country, String genre) {
        return peliculaRepository.listaporPaisOGenero(country, genre);
    }

    @Override
    public List<Pelicula> buscarPeliculaEntreAnos(Integer anoInicio, Integer anoFinal) {
        return peliculaRepository.buscarPeliculaEntreAnos(anoInicio, anoFinal);
    }
}
