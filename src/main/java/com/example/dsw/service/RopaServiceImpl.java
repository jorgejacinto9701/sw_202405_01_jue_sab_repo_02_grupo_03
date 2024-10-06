package com.example.dsw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dsw.entity.Ropa;
import com.example.dsw.repository.RopaRepository;

@Service
public class RopaServiceImpl implements RopaService {

    @Autowired
    private RopaRepository ropaRepository;


    @Override
    public List<Ropa> listaPorIDProductooPrecio(Integer id, double price) {
		return ropaRepository.listaPorIDProductooPrecio(id,price);
}

@Override
public void eliminarRopaByIDProducto(Integer id) {
    ropaRepository.eliminarRopaByIDProducto(id);
}

}
