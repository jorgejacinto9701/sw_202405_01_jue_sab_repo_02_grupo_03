package com.example.dsw.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.dsw.entity.Mercaderia;

public interface MercaderiaRepository extends MongoRepository<Mercaderia,ObjectId> {

    @Query("{ $or: [{'sku' : ?0}, {'name' : { $regex: ?1} }] }")
    public List<Mercaderia> listaPorSkuName(long sku, String name);

    @Query("{ 'type': { $ne: ?0 } }")
    public List<Mercaderia> listaPorTypeExcluido(String typeEx);

    @Query("{ 'salePrice': { $gte: ?0, $lte: ?1 } }")
    public List<Mercaderia> listaPorRangoPrecios(double min, double max);

}
