package com.example.dsw.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.dsw.entity.Empleado;

public interface EmpleadoRepository extends MongoRepository<Empleado, ObjectId> {

    @Query("{ 'name': { $regex: ?0, $options: 'i' } }") 
    public  List<Empleado> findName(String name);

    @Query("{ $and: [{ 'gender': ?0 }, {'isActive': ?1 } ]}")
    public List<Empleado> findGenderandAge(String gender, Boolean isActive);

    @Query("{ 'age': { $gte: ?0, $lte: ?1 } }")
    public List<Empleado> findByAgeBetween(Integer minAge, Integer maxAge);

    @Query("{ $or: [{ 'companycompany': ?0 }, {'randomArrayItem': ?1 }]}")
    public List<Empleado> findCompanyArrayItem(String company, String randomArrayItem);

    @Query("{ $or: [{ 'email': { $regex: ?0, $options: 'i' }, {'phone':{ $regex: ?1, $options: 'i' }]}") 
    public List<Empleado> findEmailPhone(String email, String phone);
}
