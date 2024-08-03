package com.diegorivas.efinal2_pw_api_p6_dr.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "vehiculo")
public class Vehiculo {

    @GeneratedValue(generator = "seq_vehiculo", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_vehiculo", sequenceName = "seq_vehiculo", allocationSize = 1)
    @Id
    @Column(name = "vehi_id")
    private Integer id;

    @Column(name = "vehi_marca")
    private String marca;

    @Column(name = "vehi_modelo")
    private String modelo;

    @Column(name = "vehi_color")
    private String color;

    @Column(name = "vehi_precio")
    private Double precio;
    
}
