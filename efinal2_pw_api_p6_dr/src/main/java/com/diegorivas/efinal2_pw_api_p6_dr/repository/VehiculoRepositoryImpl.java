package com.diegorivas.efinal2_pw_api_p6_dr.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.diegorivas.efinal2_pw_api_p6_dr.repository.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VehiculoRepositoryImpl implements IVehiculoRepository{

    @PersistenceContext
    private EntityManager entityManager;



    @Override
    public List<Vehiculo> buscarVehiculos() {


        TypedQuery<Vehiculo> query = this.entityManager.createQuery("SELECT v FROM Vehiculo v", 
        Vehiculo.class);
    
        return query.getResultList();
       
       
    }


    @Override
    public void insertar(Vehiculo vehiculo) {
       this.entityManager.persist(vehiculo);
    }
    
}
