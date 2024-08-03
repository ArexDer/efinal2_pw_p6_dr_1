package com.diegorivas.efinal2_pw_api_p6_dr.repository;

import java.util.List;

import com.diegorivas.efinal2_pw_api_p6_dr.repository.modelo.Vehiculo;

public interface IVehiculoRepository {
    
    public void insertar(Vehiculo vehiculo);

    public List<Vehiculo> buscarVehiculos();
    

}
