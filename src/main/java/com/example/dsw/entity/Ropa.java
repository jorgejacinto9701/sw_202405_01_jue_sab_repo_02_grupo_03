package com.example.dsw.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "ropa")
public class Ropa {

    @Id
    private ObjectId _id;
    
    @Field(name = "id")
    private Integer productId;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;
    @Field("rating")
    private Rating rating;


    @Getter
    @Setter
    class Rating {
        private Double rate;
        private Integer count;
    }
}
