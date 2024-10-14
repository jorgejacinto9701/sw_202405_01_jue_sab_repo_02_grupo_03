package com.example.dsw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.dsw.entity.Bogota;
import com.example.dsw.service.BogotaService;

@RestController
@RequestMapping("/url/bogota")
public class BogotaController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
     private  BogotaService bogotaService;

    //SIERRA TORRES, PLABLO ABRIEL

     public BogotaController(BogotaService bogotaService) {
        this.bogotaService = bogotaService;
    }

    @GetMapping("/listarPorIdYNombre/{id}/{nombre}")
     public List<Bogota> listarPorIdYNombre(@PathVariable Integer id, @PathVariable String nombre) {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Bogota-listarPorIdYNombre", null, String.class);
        return bogotaService.listarPorIdYNombre(id, nombre);
    }


    @GetMapping("/listarPorRangoDeLatitud/{minLatitud}/{maxLatitud}")
     public List<Bogota>listarPorRangoDeLatitud(@PathVariable double minLatitud,@PathVariable double maxLatitud) {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Bogota-listarPorRangoDeLatitud", null, String.class);
        return bogotaService.listarPorRangoDeLatitud(minLatitud,maxLatitud);
     }

     @GetMapping("/iconografia/{iconografia}")
     public List<Bogota> buscarPorIconografia(@PathVariable String iconografia) {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Bogota-buscarPorIconografia", null, String.class);
        return bogotaService.buscarPorIconografia(iconografia);
    }

    @GetMapping("/buscarPorIdOTelefono/{objectId}/{telefono}")
        public List<Bogota> buscarPorIdOTelefono(@PathVariable Integer objectId, @PathVariable String telefono) {
        return bogotaService.listarPorIdOTelefono(objectId, telefono);

    }

    
    //CHIRA MARTINEZ, JHONATAN

    @GetMapping("/listaPorCorreoIsNullAndTelefonoIsCero")
	public List<Bogota> listaPorCorreoIsNullAndTelefonoIsCero() {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Bogota-listaPorCorreoIsNullAndTelefonoIsCero", null, String.class);
		return bogotaService.listaPorCorreoIsNullAndTelefonoIsCero();
	}

    @GetMapping("/listaPorNombreOLongitud")
	public List<Bogota> listaPorNombreOLongitud(@RequestParam String nombre, @RequestParam Double longitud) {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Bogota-listaPorNombreOLongitud", null, String.class);
		return bogotaService.listaPorNombreOLongitud(nombre, longitud);
	}

    @GetMapping("/listaPorDireccionOTelefono")
	public List<Bogota> listaPorDireccionOTelefono(@RequestParam String direccion, @RequestParam String telefono) {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Bogota-listaPorDireccionOTelefono", null, String.class);
		return bogotaService.listaPorDireccionOTelefono(direccion, telefono);
	}

    @GetMapping("/buscarPorLatitudYLongitud")
    public List<Bogota> buscarLatitudMayorQueYLongitudMenorQue(@RequestParam Double latitud, @RequestParam Double longitud) {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Bogota-buscarPorLatitudYLongitud", null, String.class);
    return bogotaService.buscarLatitudMayorQueYLongitudMenorQue(latitud, longitud);
    }
     

}
