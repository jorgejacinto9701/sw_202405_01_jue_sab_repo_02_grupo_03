package com.example.dsw.repository;

import com.example.dsw.entity.Pelicula;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PeliculaRepository extends MongoRepository<Pelicula, ObjectId> {

    @Query("{ $or: [{ 'countries': ?0 }, { 'genres': ?1 }] }")
    public List<Pelicula> listaporPaisOGenero(String countries, String genres);

    @Query("{ 'year': { $gte: ?0, $lte: ?1 } }")
    public List<Pelicula> buscarPeliculaEntreAnos(Integer anoInicio, Integer anoFinal);

}
