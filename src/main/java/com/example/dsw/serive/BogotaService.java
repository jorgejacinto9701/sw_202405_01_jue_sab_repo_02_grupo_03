package com.example.dsw.serive;

import java.util.List;

import com.example.dsw.entity.Bogota;

public interface BogotaService {

    public List<Bogota> listaPorCorreoIsNullAndTelefonoIsCero();
    public List<Bogota> listaPorNombreOLongitud(String nombre, Double longitud);
    public List<Bogota> listaPorDireccionOTelefono(String direccion, String telefono);
    public List<Bogota> buscarLatitudMayorQueYLongitudMenorQue(Double latitud, Double longitud);
}
