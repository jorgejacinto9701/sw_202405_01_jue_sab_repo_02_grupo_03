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
@Document(collection = "empleado")
public class Empleado {

    @Id
    private ObjectId _id;

    private Integer userId;
    private String guid;
    private Boolean isActive;
    private String balance;
    private String picture;
    private Integer age;
    private String name;
    private String gender;
    private String company;
    private String email;
    private String phone;

    @Field("address")
    private Address address;

    private String about;
    private String registered;
    private Double latitude;
    private Double longitude;
    private List<String> tags;

    @Field("friends")
    private List<Friend> friends;

    private String randomArrayItem;

    @Getter
    @Setter
    class Address {
        private String primary;
        private String secondary;
    }
    @Getter
    @Setter
    class Friend {
        private Integer id;
        private String name;
    }
}
