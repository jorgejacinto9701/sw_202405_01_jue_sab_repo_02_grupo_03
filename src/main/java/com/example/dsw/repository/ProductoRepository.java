package com.example.dsw.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.dsw.entity.Producto;

public interface ProductoRepository extends MongoRepository<Producto, ObjectId>{

    /*CASO 1 */
    @Query(" { $or:[{ 'sku':  ?0 }, {'type': ?1 }]}")
    public List<Producto> listProductosBySku(Long sku, String type);

    @Query(" { $and: [{ 'type': ?0 }, { 'name': ?1 }]}")
    public List<Producto> listProductosAnd(String type, String name);

    /*CASO 2*/
    @Query(" { 'regularPrice': { $gte: ?0, $lte: ?1}}")
    public List<Producto> listProductosPorPrecio(Double minPrecio, Double maxPrice);


}
