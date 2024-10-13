package com.example.dsw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.dsw.entity.Ropa;
import com.example.dsw.service.RopaService;

@RestController
@RequestMapping("/url/ropa")
public class RopaController {

@Autowired
private RestTemplate restTemplate;

 @Autowired
    private RopaService ropaService;


    @GetMapping("/listaPorIDProducto_o_Precio/{id}/{price}")
    public List<Ropa> listaPorIDProductooPrecio(@PathVariable Integer id, @PathVariable double price) {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Ropa-listaPorIDProducto_o_Precio", null, String.class);        
        return ropaService.listaPorIDProductooPrecio(id, price);
    }
    @GetMapping("/test")
public String testEndpoint() {
    return "Endpoint is working!";
}

 @DeleteMapping("/eliminarRopaByIDProducto/{id}")
    public ResponseEntity<String> eliminarRopa(@PathVariable Integer id) {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Ropa-eliminarRopa", null, String.class);        
        ropaService.eliminarRopaByIDProducto(id);
        return ResponseEntity.ok("Ropa eliminada con éxito");
    }



}
