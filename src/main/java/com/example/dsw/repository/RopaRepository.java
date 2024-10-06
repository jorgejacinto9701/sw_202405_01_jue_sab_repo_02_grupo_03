package com.example.dsw.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.dsw.entity.Ropa;

public interface RopaRepository  extends MongoRepository<Ropa, ObjectId> {

    
	@Query("{ $or: [{id: ?0}, {price: ?1}] }")    
	public List<Ropa> listaPorIDProductooPrecio(Integer id, double price);
}
