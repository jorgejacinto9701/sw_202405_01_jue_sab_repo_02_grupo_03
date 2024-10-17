package com.example.dsw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.dsw.entity.Empleado;
import com.example.dsw.service.EmpleadoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/url/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/listarEmpleado")
    public List<Empleado> listarEmpleado() {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Empleado-findAll", null, String.class);
        return empleadoService.listAllEmpleado();
    }

    @GetMapping("/buscarPorNombre/{name}")
    public List<Empleado> findName(@PathVariable  String name) {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Empleado-findName", null, String.class);
        return empleadoService.findName(name);
    }

    @GetMapping("/buscarPorGeneroEdad/{gender}/{isActive}")
    public List<Empleado> findGenderandAge(@PathVariable  String gender, @PathVariable Boolean isActive) {
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Empleado-findGenderandAge", null, String.class);
        return empleadoService.findGenderandAge(gender, isActive);
    }

    @GetMapping("/entreEdad/{minAge}/{maxAge}")
    public List<Empleado> findByAgeBetween(@PathVariable Integer minAge,@PathVariable Integer maxAge){
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Empleado-findByAgeBetween", null, String.class);

        return empleadoService.findByAgeBetween(minAge,maxAge);
    }
    
    @GetMapping("/listarCompaniaItem/{company}/{randomArrayItem}")
    public List<Empleado> findCompanyArrayItem(@PathVariable String company,@PathVariable  String randomArrayItem){
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Empleado-findCompanyArrayItem", null, String.class);
        return empleadoService.findCompanyArrayItem(company, randomArrayItem);
    }

    @GetMapping("/buscarEmailPhone/{email}/{phone}")
    public  List<Empleado> findEmailPhone(@PathVariable String email,@PathVariable String phone){
        restTemplate.postForObject("http://localhost:8097/url/auditoria/registrar/MONGODB-Examen-Empleado-findEmailPhone", null, String.class);
        return empleadoService.findEmailPhone(email, phone);
    }
    
    
}
