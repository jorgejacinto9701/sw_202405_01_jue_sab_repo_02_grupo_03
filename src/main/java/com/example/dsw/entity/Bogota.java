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
@Document(collection = "bogota")
public class Bogota {

    @Id
    private ObjectId _id;

    
    @Field("OBJECTID")
    private Integer objectId;
    
    @Field("CODIGO")
    private String codigo;
    
    @Field("NOMBRE")
    private String nombre;
    
    @Field("DIRECCION")
    private String direccion;

    @Field("TIPO_DE_PA")
    private String tipoDePatrimonio;

    @Field("ICONOGRAFI")
    private String iconografia;

    @Field("NOMBRE_PRO")
    private String nombreProyecto;

    @Field("DIRECCIO_1")
    private String direccionProyecto;

    @Field("CORREO_PRO")
    private String correoProyecto;

    @Field("LATITUD")
    private Double latitud;
    @Field("LONGITUD")
    private Double longitud;
    @Field("ID")
    private Integer id;
    @Field("TELEFONO")
    private String telefono;

    @Field("geometry")
    private Geometry geometry;

    
    @Getter
    @Setter
    class  Geometry {
        private String type;
        private List<Double> coordinates;

    }
}
