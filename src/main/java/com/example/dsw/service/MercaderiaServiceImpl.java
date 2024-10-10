package com.example.dsw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dsw.entity.Mercaderia;
import com.example.dsw.repository.MercaderiaRepository;

@Service
public class MercaderiaServiceImpl implements MercaderiaService {
    @Autowired
    private MercaderiaRepository repoMercaderia; 

    @Override
    public List<Mercaderia> listMercaderia() {
        return repoMercaderia.findAll();
    }

    @Override
    public List<Mercaderia> listaPorSkuName(long sku, String name) {
       return repoMercaderia.listaPorSkuName(sku, name);
    }

    @Override
    public List<Mercaderia> listaPorTypeExcluido(String typeEx) {
        return repoMercaderia.listaPorTypeExcluido(typeEx);
    }

    @Override
    public List<Mercaderia> listaPorRangoPrecios(double min, double max) {
        return repoMercaderia.listaPorRangoPrecios(min, max);
    }

}
