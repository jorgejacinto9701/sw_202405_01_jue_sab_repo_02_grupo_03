package com.example.dsw.service;

import java.util.List;

import com.example.dsw.entity.Producto;

public interface ProductoService {

    public List<Producto> listAllProductos();
    public List<Producto> listProductosBySku(Long sku, String type);
    public List<Producto> listProductosAnd(String type, String name);
    public List<Producto> listProductosPorPrecio(Double minPrecio, Double maxPrice);

    
}
