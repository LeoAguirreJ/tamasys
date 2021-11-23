package com.ciclo4.tamasys.controlador;

import com.ciclo4.tamasys.modelo.conductoresModelo;
import com.ciclo4.tamasys.vista.conductoresRepositorio;
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

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/api/tamasys")
public class conductoresControlador {
    
    @Autowired
    private conductoresRepositorio repository;
    
    @PostMapping("/conductores/crear/")
    public conductoresModelo crearConductor(@RequestBody @Validated conductoresModelo s){
        return repository.insert(s);
    }
    
    @GetMapping("/conductores/consultar/")
    public List<conductoresModelo> consultarConductores(){
        return repository.findAll();
    }
    
    @GetMapping("/conductores/consultar/{id}")
    public Optional<conductoresModelo> consultarConductoresId(@PathVariable String id){
        return repository.findById(id);
    }
    
    @PutMapping("/conductores/actualizar/{id}")
    public conductoresModelo actualizarConductores(@PathVariable String id, @RequestBody @Validated conductoresModelo s){
        return repository.save(s);
    }
    
    @DeleteMapping("/conductores/eliminar/{id}")
    public void eliminarConductores(@PathVariable String id){
        repository.deleteById(id);
    }    
}
