package com.example.dsw.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "covid")
public class Covid {

    @Id
    private ObjectId _id;

    private String dateRep;
    private String day;
    private String month;
    private String year;
    private Integer cases;
    private Integer deaths;

    @Field("countriesAndTerritories")
    private String country;

    private String geoId;
    private String countryterritoryCode;
    private Long popData2019;
    private String continentExp;

    @Field("Cumulative_number_for_14_days_of_COVID_19_cases_per_100000")
    private Double cumulativeCasesPer100k;

}
