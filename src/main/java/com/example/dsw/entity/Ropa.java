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

    // Constructor por defecto (necesario para Spring Data y MongoDB)
    public Ropa() {
    }

    // Constructor con todos los campos
    public Ropa(ObjectId _id, Integer productId, String title, Double price, String description, String category, String image, Rating rating) {
        this._id = _id;
        this.productId = productId;
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.image = image;
        this.rating = rating;
    }

    @Getter
    @Setter
    public static class Rating {
        private Double rate;
        private Integer count;

        // Constructor por defecto (necesario para Spring Data y MongoDB)
        public Rating() {
        }

        // Constructor con todos los campos
        public Rating(Double rate, Integer count) {
            this.rate = rate;
            this.count = count;
        }
    }
}