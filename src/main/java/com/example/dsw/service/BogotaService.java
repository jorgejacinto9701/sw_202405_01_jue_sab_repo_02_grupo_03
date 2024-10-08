package com.example.dsw.service;

import java.util.List;

import com.example.dsw.entity.Bogota;

public interface BogotaService {

     public List<Bogota> listarPorIdYNombre(Integer id, String nombre);

     public List<Bogota> listarPorRangoDeLatitud(double minLatitud, double maxLatitud);

     public List<Bogota> buscarPorIconografia(String iconografia);

     public List<Bogota> listarPorIdOTelefono(Integer objectId, String telefono);


}
