package com.example.dsw.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.dsw.entity.Bogota;

public interface BogotaRepository  extends MongoRepository<Bogota, ObjectId> {

    //SIERRA TORRES, PLABLO ABRIEL

    @Query("{ $and: [{ 'id': ?0 }, { 'nombre': ?1 }] }")
    public List<Bogota> listarPorIdYNombre(Integer id, String nombre);

    @Query("{ 'latitud': { $gt: ?0, $lt: ?1 } }")
    public List<Bogota> listarPorRangoDeLatitud(double minLatitud, double maxLatitud);

    @Query("{ 'iconografia': { $regex: ?0, $options: 'i' } }") 
    public  List<Bogota> findByIconografiaRegex(String iconografia);

    @Query("{ $or: [{ 'objectId': ?0 }, { 'telefono': ?1 }] }")
    public List<Bogota> listarPorIdOTelefono(Integer objectId, String telefono);


    //CHIRA MARTINEZ, JHONATAN

    @Query("{ $and: [ {correo: null }, {telefono: '0' } ] }")
	public List<Bogota> listaPorCorreoIsNullAndTelefonoIsCero();

    @Query("{ $or: [{nombre: ?0}, {longitud: ?1}] }")
	public List<Bogota> listaPorNombreOLongitud(String nombre, Double longitud);

    @Query("{ $or: [ { 'direccion' : { $regex: ?0 } }, { 'telefono' : { $regex: ?1 } } ] }")
    public List<Bogota> listaPorDireccionOTelefono(String direccion, String telefono);

    @Query("{ latitud: { $gt: ?0 }, longitud: { $lt: ?1 } }")
    public List<Bogota> buscarLatitudMayorQueYLongitudMenorQue(Double latitud, Double longitud);

}
