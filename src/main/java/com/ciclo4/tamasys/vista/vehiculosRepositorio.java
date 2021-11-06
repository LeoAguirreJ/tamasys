/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciclo4.tamasys.vista;

import com.ciclo4.tamasys.modelo.vehiculosModelo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Alejandra Moreno Vallejo
 */
@Repository
public interface vehiculosRepositorio extends MongoRepository<vehiculosModelo, String> {
    
}
