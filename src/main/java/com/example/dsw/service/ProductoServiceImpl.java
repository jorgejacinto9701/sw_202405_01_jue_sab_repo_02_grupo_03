package com.example.dsw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dsw.entity.Producto;
import com.example.dsw.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listAllProductos() {
        return productoRepository.findAll();
    }

    @Override
    public List<Producto> listProductosBySku(Long sku, String type) {
        return productoRepository.listProductosBySku(sku, type);
    }

    @Override
    public List<Producto> listProductosAnd(String type, String name){
        return productoRepository.listProductosAnd(type, name);
    }

    @Override
    public List<Producto> listProductosPorPrecio(Double minPrecio, Double maxPrice) {
        return productoRepository.listProductosPorPrecio(minPrecio, maxPrice);
    }


}
