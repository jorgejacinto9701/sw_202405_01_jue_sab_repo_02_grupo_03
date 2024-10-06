package com.example.dsw.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "mercaderia")
public class Mercaderia {

    
    @Id
    private ObjectId _id;
    private Long sku; // SKU es un número, se puede usar long
    private String name;
    private String type;
    private Double regularPrice;
    private Double salePrice;
    private String shippingWeight;
}
