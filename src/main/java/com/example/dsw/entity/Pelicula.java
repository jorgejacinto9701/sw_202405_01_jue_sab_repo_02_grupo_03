package com.example.dsw.entity;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "pelicula")
public class Pelicula {

    @Id
    private ObjectId _id;
    private String title;
    private Integer year;
    private String rated;
    private Integer runtime;
    private List<String> countries;
    private List<String> genres;
    private String director;
    private List<String> writers;
    private List<String> actors;
    private String plot;
    private String poster;

    @Field("imdb")
    private Imdb imdb;

    @Field("tomato")
    private Tomato tomato;

    private Integer metacritic;

    @Field("awards")
    private Awards awards;

    private String type;

    @Getter
    @Setter
    class Imdb {
        private String id;
        private Double rating;
        private Integer votes;
    }

    @Getter
    @Setter
    class Tomato {
        private Integer meter;
        private String image;
        private Double rating;
        private Integer reviews;
        private Integer fresh;
        private String consensus;
        private Integer userMeter;
        private Double userRating;
        private Integer userReviews;
    }

    @Getter
    @Setter
    class Awards {
        private Integer wins;
        private Integer nominations;
        private String text;
    }
}
