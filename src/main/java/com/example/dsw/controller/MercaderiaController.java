package com.example.dsw.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.dsw.entity.Mercaderia;
import com.example.dsw.service.MercaderiaService;

@RestController
@RequestMapping("/url/mercaderia")
public class MercaderiaController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MercaderiaService serviceMercaderia;

    @GetMapping("/listaMercaderia")
    public List<Mercaderia> listaTodos() {
        return serviceMercaderia.listMercaderia();
    }

    @GetMapping("/listaPorSkuName/{sku}/{name}")
    public List<Mercaderia> listaPorSkuName(@PathVariable Long sku, @PathVariable String name) {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Mercaderia-listaPorSkuName", null, String.class);
        return serviceMercaderia.listaPorSkuName(sku,name);
    }

    @GetMapping("/listaPorTypeExcluido/{type}")
    public List<Mercaderia> listaPorTypeExcluido(@PathVariable String type) {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Mercaderia-listaPorTypeExcluido", null, String.class);
        return serviceMercaderia.listaPorTypeExcluido(type);
    }

    @GetMapping("/listaPorRangoPrecios/{min}/{max}")
    public List<Mercaderia> listaPorRangoPrecios(@PathVariable Double min, @PathVariable Double max) {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Mercaderia-listaPorRangoPrecios", null, String.class);
        return serviceMercaderia.listaPorRangoPrecios(min,max);
    }
}
