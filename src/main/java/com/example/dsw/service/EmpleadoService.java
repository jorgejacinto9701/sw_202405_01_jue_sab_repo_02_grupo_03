package com.example.dsw.service;

import java.util.List;

import com.example.dsw.entity.Empleado;


public interface EmpleadoService {

    public abstract List<Empleado> listAllEmpleado();
    public abstract List<Empleado> findName(String name);
    public abstract List<Empleado> findGenderandAge(String gender, Boolean isActive);
    public abstract List<Empleado> findByAgeBetween(Integer minAge, Integer maxAge);
    public abstract List<Empleado> findCompanyArrayItem(String company, String randomArrayItem);
    public abstract List<Empleado> findEmailPhone(String email, String phone);

}
