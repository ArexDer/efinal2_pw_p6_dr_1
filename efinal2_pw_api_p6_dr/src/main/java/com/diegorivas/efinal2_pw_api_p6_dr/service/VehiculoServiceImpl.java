package com.diegorivas.efinal2_pw_api_p6_dr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegorivas.efinal2_pw_api_p6_dr.repository.IVehiculoRepository;
import com.diegorivas.efinal2_pw_api_p6_dr.repository.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

    @Autowired
    private IVehiculoRepository iVehiculoRepository;

    @Override
    public void insertar(Vehiculo vehiculo) {

        this.iVehiculoRepository.insertar(vehiculo);

    }

    @Override
    public List<Vehiculo> listarVehiculos() {

        return this.iVehiculoRepository.buscarVehiculos();
       
    }

}
