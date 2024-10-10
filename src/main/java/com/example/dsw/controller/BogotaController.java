package com.example.dsw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dsw.entity.Bogota;
import com.example.dsw.serive.BogotaService;

@RestController
@RequestMapping("url/bogota")
public class BogotaController {

    @Autowired
	private BogotaService bogotaService;

    @GetMapping("/listaPorCorreoIsNullAndTelefonoIsCero")
	public List<Bogota> listaPorCorreoIsNullAndTelefonoIsCero() {
		return bogotaService.listaPorCorreoIsNullAndTelefonoIsCero();
	}

    @GetMapping("/listaPorNombreOLongitud")
	public List<Bogota> listaPorNombreOLongitud(@RequestParam String nombre, @RequestParam Double longitud) {
		return bogotaService.listaPorNombreOLongitud(nombre, longitud);
	}

    @GetMapping("/listaPorDireccionOTelefono")
	public List<Bogota> listaPorDireccionOTelefono(@RequestParam String direccion, @RequestParam String telefono) {
		return bogotaService.listaPorDireccionOTelefono(direccion, telefono);
	}

    @GetMapping("/buscarPorLatitudYLongitud")
    public List<Bogota> buscarLatitudMayorQueYLongitudMenorQue(@RequestParam Double latitud, @RequestParam Double longitud) {
    return bogotaService.buscarLatitudMayorQueYLongitudMenorQue(latitud, longitud);
    }
    
}
