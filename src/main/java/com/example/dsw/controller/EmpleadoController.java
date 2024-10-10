package com.example.dsw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dsw.entity.Empleado;
import com.example.dsw.service.EmpleadoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/url/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;
    
    @GetMapping("/listarEmpleado")
    public List<Empleado> listarEmpleado() {
        return empleadoService.listAllEmpleado();
    }

    @GetMapping("/buscarPorNombre/{name}")
    public List<Empleado> findName(@PathVariable  String name) {
        return empleadoService.findName(name);
    }

    @GetMapping("/buscarPorGeneroEdad/{gender}/{isActive}")
    public List<Empleado> findGenderandAge(@PathVariable  String gender, @PathVariable Boolean isActive) {
        return empleadoService.findGenderandAge(gender, isActive);
    }

    @GetMapping("/entreEdad/{minAge}/{maxAge}")
    public List<Empleado> findByAgeBetween(@PathVariable Integer minAge,@PathVariable Integer maxAge){
        return empleadoService.findByAgeBetween(minAge,maxAge);
    }
    
    @GetMapping("/listarCompaniaItem/{company}/{randomArrayItem}")
    public List<Empleado> findCompanyArrayItem(@PathVariable String company,@PathVariable  String randomArrayItem){
        return empleadoService.findCompanyArrayItem(company, randomArrayItem);
    }

    @GetMapping("/buscarEmailPhone/{email}/{phone}")
    public  List<Empleado> findEmailPhone(@PathVariable String email,@PathVariable String phone){
        return empleadoService.findEmailPhone(email, phone);
    }
    
    
}
