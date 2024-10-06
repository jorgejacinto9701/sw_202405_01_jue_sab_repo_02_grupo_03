package com.example.dsw.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.dsw.entity.Bogota;

public interface BogotaRepository  extends MongoRepository<Bogota, ObjectId> {

}
