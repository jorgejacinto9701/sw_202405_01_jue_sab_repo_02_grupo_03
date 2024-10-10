package com.example.dsw.service;

import java.util.List;
import com.example.dsw.entity.Mercaderia;

public interface MercaderiaService {

    public List<Mercaderia> listMercaderia();
    public List<Mercaderia> listaPorSkuName(long sku, String name);
    public List<Mercaderia> listaPorTypeExcluido(String typeEx);
    public List<Mercaderia> listaPorRangoPrecios(double min, double max);
}
