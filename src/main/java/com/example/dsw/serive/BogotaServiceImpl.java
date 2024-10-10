package com.example.dsw.serive;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dsw.entity.Bogota;
import com.example.dsw.repository.BogotaRepository;

@Service
public class BogotaServiceImpl implements BogotaService{

    @Autowired
	private BogotaRepository bogotaRepository;

    @Override
	public List<Bogota> listaPorCorreoIsNullAndTelefonoIsCero() {
		return bogotaRepository.listaPorCorreoIsNullAndTelefonoIsCero();
	}

    @Override
	public List<Bogota> listaPorNombreOLongitud(String nombre, Double longitud) {
		return bogotaRepository.listaPorNombreOLongitud(nombre, longitud);
	}

    @Override
	public List<Bogota> listaPorDireccionOTelefono(String direccion, String telefono) {
		return bogotaRepository.listaPorDireccionOTelefono(direccion, telefono);
	}

    @Override
	public List<Bogota> buscarLatitudMayorQueYLongitudMenorQue(Double latitud, Double longitud) {
		return bogotaRepository.buscarLatitudMayorQueYLongitudMenorQue(latitud, longitud);
	}
}
