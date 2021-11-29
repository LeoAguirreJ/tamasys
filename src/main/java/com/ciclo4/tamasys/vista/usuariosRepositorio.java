package com.ciclo4.tamasys.vista;

import com.ciclo4.tamasys.modelo.usuariosModelo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leandro Aguirre
 */
@Repository
public interface usuariosRepositorio extends MongoRepository<usuariosModelo, String> {
    
}
