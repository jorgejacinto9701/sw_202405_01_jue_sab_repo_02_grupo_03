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
@Document(collection = "pais")
public class Pais {
    @Id
    private ObjectId _id;
    private String name;

    @Field("topLevelDomain")
    private List<String> topLevelDomain;

    private String alpha2Code;
    private String alpha3Code;
    
    @Field("callingCodes")
    private List<String> callingCodes;
    
    private String capital;
    
    @Field("altSpellings")
    private List<String> altSpellings;

    private String subregion;
    private String region;
    private Long population;

    @Field("latlng")
    private List<Double> latlng;

    private String demonym;
    private Double area;

    @Field("timezones")
    private List<String> timezones;

    private List<String> borders;

    @Field("nativeName")
    private String nativeName;

    @Field("numericCode")
    private String numericCode;

    private Flags flags;

    private List<Currency> currencies;

    private List<Language> languages;

    private Translations translations;

    private String flag;

    @Field("regionalBlocs")
    private List<RegionalBloc> regionalBlocs;

    private String cioc;
    private Boolean independent;

    @Getter
    @Setter
    class Flags {
        private String svg;
        private String png;
    }
    @Getter
    @Setter
    class Currency {
        private String code;
        private String name;
        private String symbol;
    }
    @Getter
    @Setter
    class Language {
        private String iso639_1;
        private String iso639_2;
        private String name;
        private String nativeName;
    }
    @Getter
    @Setter
    class Translations {
        private String br;
        private String pt;
        private String nl;
        private String hr;
        private String fa;
        private String de;
        private String es;
        private String fr;
        private String ja;
        private String it;
        private String hu;
    }
    @Getter
    @Setter
    class RegionalBloc {
        private String acronym;
        private String name;
    }
}
