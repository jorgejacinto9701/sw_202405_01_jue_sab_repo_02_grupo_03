package com.example.dsw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dsw.entity.Producto;
import com.example.dsw.service.ProductoService;

@RestController
@RequestMapping("/url/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/listaProductos")
    public List<Producto> listaTodos() {
        return productoService.listAllProductos();
    }

    @GetMapping("/listaProductoPor/{sku}/{type}")
    public List<Producto> listaProductosPorSku(@PathVariable Long sku, @PathVariable String type ){
        return productoService.listProductosBySku(sku, type);
    }

    @GetMapping("/listaProductosAnd/{type}/{name}")
    public List<Producto> listProductosAnd(@PathVariable String type, @PathVariable String name){
        return productoService.listProductosAnd(type, name);
    }

    @GetMapping("/listaProductosPorPrecio/{minPrecio}/{maxPrice}")
    public List<Producto> listProductosPorPrecio(@PathVariable Double minPrecio, @PathVariable Double maxPrice){
        return productoService.listProductosPorPrecio(minPrecio, maxPrice);
    }
}

