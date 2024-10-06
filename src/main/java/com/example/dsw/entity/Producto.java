package com.example.dsw.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "producto")
public class Producto {

    @Id
    private ObjectId _id;
    private Long sku;
    private String name;
    private String type;
    private Double regularPrice;
    private Double salePrice;
}
