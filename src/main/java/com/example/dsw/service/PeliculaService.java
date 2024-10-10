package com.example.dsw.service;
import java.util.List;
import com.example.dsw.entity.Pelicula;


public interface PeliculaService {

    public abstract List<Pelicula> listaporPaisOGenero(String country, String genre);
    public abstract List<Pelicula> buscarPeliculaEntreAnos(Integer anoInicio, Integer anoFinal);
}
