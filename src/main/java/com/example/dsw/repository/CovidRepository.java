package com.example.dsw.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.dsw.entity.Covid;

public interface CovidRepository extends MongoRepository<Covid, ObjectId>{

    @Query("{ $and:[{month:?0},{countryterritoryCode:?1}]}")
    public List<Covid> listaPorMesPais(String month,String countryterritoryCode);

    @Query(value = "{ $and: [ { 'deaths': { $lt: ?0 } }, { 'countryterritoryCode': ?1 } ] }", delete = true)
    public void eliminaPorMuertesPais(Integer deaths, String countryterritoryCode);

}
