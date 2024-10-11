package com.example.dsw.service;

import java.util.List;

import com.example.dsw.entity.Bogota;

public interface BogotaService {

     //SIERRA TORRES, PLABLO ABRIEL

     public List<Bogota> listarPorIdYNombre(Integer id, String nombre);

     public List<Bogota> listarPorRangoDeLatitud(double minLatitud, double maxLatitud);

     public List<Bogota> buscarPorIconografia(String iconografia);

     public List<Bogota> listarPorIdOTelefono(Integer objectId, String telefono);


     //CHIRA MARTINEZ, JHONATAN

     public List<Bogota> listaPorCorreoIsNullAndTelefonoIsCero();
     public List<Bogota> listaPorNombreOLongitud(String nombre, Double longitud);
     public List<Bogota> listaPorDireccionOTelefono(String direccion, String telefono);
     public List<Bogota> buscarLatitudMayorQueYLongitudMenorQue(Double latitud, Double longitud);
}
