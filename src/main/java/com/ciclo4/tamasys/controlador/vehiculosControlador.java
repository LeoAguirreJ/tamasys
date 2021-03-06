/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ciclo4.tamasys.controlador;

import com.ciclo4.tamasys.modelo.vehiculosModelo;
import com.ciclo4.tamasys.vista.vehiculosRepositorio;
import java.util.List;
import java.util.Optional;
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
 * @author Alejandra Moreno Vallejo
 */
@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/api/tamasys")
public class vehiculosControlador {
    
   @Autowired
   private vehiculosRepositorio repository;
    
    //Insertar Vehiculos
    @PostMapping("/vehiculos/crear")
    public vehiculosModelo crearVehiculo(@RequestBody @Validated vehiculosModelo vehiculo){
        return repository.insert(vehiculo);
    }
    
    //Consultar todos los Vehiculos
    @GetMapping("/vehiculos/consultar")
    public List<vehiculosModelo> consultarVehiculos(){
        return repository.findAll();
    }
    
    //Consultar Vehiculos Id
    @GetMapping("/vehiculos/consultar/{id}")
    public Optional<vehiculosModelo> consultarVehiculosId(@PathVariable String id){
        return repository.findById(id);
    }
    
    //Actualizar Vehiculos
    @PutMapping("/vehiculos/actualizar/{id}")
    public vehiculosModelo actualizarVehiculos(@PathVariable String id, @RequestBody @Validated vehiculosModelo s){
        return repository.save(s);
    }
    
    //Eliminar Vehiculos
    @DeleteMapping("/vehiculos/eliminar/{id}")
    public void eliminarVehiculos(@PathVariable String id){
        repository.deleteById(id);
    }    
}
