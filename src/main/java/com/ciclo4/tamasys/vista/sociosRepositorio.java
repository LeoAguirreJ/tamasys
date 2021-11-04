package com.ciclo4.tamasys.vista;

import com.ciclo4.tamasys.modelo.sociosModelo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leandro Aguirre
 */
@Repository
public interface sociosRepositorio extends MongoRepository<sociosModelo, String> {
    
}
