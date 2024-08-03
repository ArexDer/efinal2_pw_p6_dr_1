package com.diegorivas.efinal2_pw_api_p6_dr.service.to;

import org.springframework.hateoas.RepresentationModel;

import lombok.Data;

@Data
public class VehiculoTo extends RepresentationModel<VehiculoTo> {

    private Integer id;
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private String precio;
    
}
