package com.example.dsw.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dsw.entity.Bogota;
import com.example.dsw.service.BogotaService;

@RestController
@RequestMapping("/url/bogota")
public class BogotaController {

     private  BogotaService bogotaService;

     public BogotaController(BogotaService bogotaService) {
        this.bogotaService = bogotaService;
    }

    @GetMapping("/listarPorIdYNombre/{id}/{nombre}")
     public List<Bogota> listarPorIdYNombre(@PathVariable Integer id, @PathVariable String nombre) {
        return bogotaService.listarPorIdYNombre(id, nombre);
    }


    @GetMapping("/listarPorRangoDeLatitud/{minLatitud}/{maxLatitud}")
     public List<Bogota>listarPorRangoDeLatitud(@PathVariable double minLatitud,@PathVariable double maxLatitud) {
         return bogotaService.listarPorRangoDeLatitud(minLatitud,maxLatitud);
     }

     @GetMapping("/iconografia/{iconografia}")
     public List<Bogota> buscarPorIconografia(@PathVariable String iconografia) {
        return bogotaService.buscarPorIconografia(iconografia);
    }

    @GetMapping("/buscarPorIdOTelefono/{objectId}/{telefono}")
    public List<Bogota> buscarPorIdOTelefono(@PathVariable Integer objectId, @PathVariable String telefono) {
    return bogotaService.listarPorIdOTelefono(objectId, telefono);
}
     

}
