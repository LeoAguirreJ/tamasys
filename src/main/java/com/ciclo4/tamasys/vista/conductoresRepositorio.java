package com.ciclo4.tamasys.vista;

import com.ciclo4.tamasys.modelo.conductoresModelo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface conductoresRepositorio extends MongoRepository<conductoresModelo, String> {
    
}