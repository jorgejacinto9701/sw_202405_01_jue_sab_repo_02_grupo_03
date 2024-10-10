package com.example.dsw.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.dsw.entity.Covid;

public interface CovidRepository  extends MongoRepository<Covid, ObjectId> {
	

	@Query("{ 'deaths' : { $gte: ?0 } }")
	public List<Covid> listaMayorDeaths(Integer deaths);
	
	@Query("{ $or: [{month: ?0}, {year: ?1}] }") 
    public List<Covid> listaPorMesOAño(String month, String year);
    
    @Query("{ 'country' : ?0 }")
	public List<Covid> buscarPorCountry(String country);

	@Query("{ $and: [{day: ?0}, {year: ?1}] }") 
    public List<Covid> listaPorDíaYAño(String day, String year);

}
