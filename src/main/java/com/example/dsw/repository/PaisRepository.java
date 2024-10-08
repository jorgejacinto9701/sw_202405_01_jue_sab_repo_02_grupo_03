package com.example.dsw.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.dsw.entity.Pais;


public interface PaisRepository extends MongoRepository<Pais, ObjectId> {

    @Query("{$and: [{ 'region': ?0 },{ 'population': { $gte: ?1 } }]}")
    public List<Pais> listaporPaisPopularidada(String region, Long population);

    @Query("{ 'area' : { $in: ?0 } }")
    public List<Pais> listaInPorArea(List<Double> area);;

}
