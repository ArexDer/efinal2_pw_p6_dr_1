package com.diegorivas.efinal2_pw_api_p6_dr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegorivas.efinal2_pw_api_p6_dr.repository.modelo.Vehiculo;
import com.diegorivas.efinal2_pw_api_p6_dr.service.IVehiculoService;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path = "/vehiculos")
@CrossOrigin
public class VehiculoController {

    @Autowired
    private IVehiculoService iVehiculoService;


    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Vehiculo> guardadVehiculo(@RequestBody Vehiculo vehiculo) {
     
        this.iVehiculoService.insertar(vehiculo);
		return ResponseEntity.status(201).body(vehiculo);

	}
    


    /*
    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Vehiculo> buscarTodos() {
		List<Vehiculo> vehiculos = this.iVehiculoService.listarVehiculos();
		
        return vehiculos;

	}
         */


    


    
    
}
