package com.example.dsw.service;

import java.util.List;

import com.example.dsw.entity.Ropa;

public interface RopaService {
	public abstract List<Ropa> listaPorIDProductooPrecio(Integer id, double price);

}
