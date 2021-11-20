/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciclo4.tamasys.controlador;

import com.ciclo4.tamasys.modelo.pagosModelo;
import com.ciclo4.tamasys.vista.pagosRepositorio;
import java.util.List;
import java.util.Optional;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tamasys
 */
@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/api/tamasys")
public class pagosControlador {
    
    @Autowired
    private pagosRepositorio repository;
    
    @PostMapping("/pagos/crear")
    public pagosModelo crearPago(@RequestBody @Validated pagosModelo pago){
        return repository.insert(pago);
    }
    
    @GetMapping("/pagos/consultar")
    public List<pagosModelo> consultarPagos(){
        return repository.findAll();
    }
    
    @GetMapping("/pagos/consultar/{id}")
    public Optional<pagosModelo> consultarPagosId(@PathVariable String id){
        return repository.findById(id);
    }
    
    @PutMapping("/pagos/actualizar/{id}")
    public pagosModelo actualizarPagos(@PathVariable String id, @RequestBody @Validated pagosModelo pago){
        return repository.save(pago);
    }
    
    @DeleteMapping("/pagos/eliminar/{id}")
    public void eliminarPagos(@PathVariable String id){
        repository.deleteById(id);
    }
}
