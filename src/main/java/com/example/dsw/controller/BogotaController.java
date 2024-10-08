package com.example.dsw.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

     @GetMapping("/listarPorIdYNombre")
     public List<Bogota> listarPorIdYNombre(@RequestParam Integer id, @RequestParam String nombre) {
         return bogotaService.listarPorIdYNombre(id, nombre);
     }

     @GetMapping("/listarPorRangoDeLatitud")
     public List<Bogota>listarPorRangoDeLatitud(@RequestParam double minLatitud,@RequestParam double maxLatitud) {
         return bogotaService.listarPorRangoDeLatitud(minLatitud,maxLatitud);
     }

     @GetMapping("/iconografia")
     public List<Bogota> buscarPorIconografia(@RequestParam String iconografia) {
        return bogotaService.buscarPorIconografia(iconografia);
    }

    @GetMapping("/buscarPorIdOTelefono")
    public List<Bogota> buscarPorIdOTelefono(@RequestParam Integer objectId, @RequestParam String telefono) {
    return bogotaService.listarPorIdOTelefono(objectId, telefono);
}
     

}
