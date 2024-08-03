package com.diegorivas.efinal2_pw_api_p6_dr.service;

import java.util.List;

import com.diegorivas.efinal2_pw_api_p6_dr.repository.modelo.Vehiculo;
import com.diegorivas.efinal2_pw_api_p6_dr.service.to.VehiculoTo;

public interface IVehiculoService {

    public void insertar(Vehiculo vehiculo);

    public List<Vehiculo> listarVehiculos();

   
    
}
