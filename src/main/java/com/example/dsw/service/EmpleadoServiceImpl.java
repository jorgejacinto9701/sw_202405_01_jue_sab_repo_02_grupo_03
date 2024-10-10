package com.example.dsw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import com.example.dsw.entity.Empleado;
import com.example.dsw.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> listAllEmpleado(){
        return empleadoRepository.findAll();
    }

    @Override
    public List<Empleado> findName(String name){
        return empleadoRepository.findName(name);
    }

    @Override
    public List<Empleado> findGenderandAge(String gender, Boolean isActive){
        return empleadoRepository.findGenderandAge(gender, isActive);
    }

    @Override
    public List<Empleado> findByAgeBetween(Integer minAge, Integer maxAge){
     return empleadoRepository.findByAgeBetween(minAge, maxAge);
    }

    @Override
    public List<Empleado> findCompanyArrayItem(String company, String randomArrayItem){
        return empleadoRepository.findCompanyArrayItem(company, randomArrayItem);
    }

    @Override
    public  List<Empleado> findEmailPhone(String email, String phone){
        return empleadoRepository.findEmailPhone(email, phone);
    }

}
