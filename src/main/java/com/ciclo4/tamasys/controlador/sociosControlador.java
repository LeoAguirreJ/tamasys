package com.ciclo4.tamasys.controlador;

import com.ciclo4.tamasys.modelo.sociosModelo;
import com.ciclo4.tamasys.vista.sociosRepositorio;
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
 * @author Leandro Aguirre
 */

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/api/tamasys")
public class sociosControlador {
    
    @Autowired
    private sociosRepositorio repository;
    
    @PostMapping("/socios/")
    public sociosModelo crearSocio(@RequestBody @Validated sociosModelo s){
        return repository.insert(s);
    }
    
    @GetMapping("/socios/")
    public List<sociosModelo> consultarSocios(){
        return repository.findAll();
    }
    
    @GetMapping("/socios/{id}")
    public Optional<sociosModelo> consultarSociosId(@PathVariable String id){
        return repository.findById(id);
    }
    
    @PutMapping("/socios/{id}")
    public sociosModelo actualizarSocios(@PathVariable String id, @RequestBody @Validated sociosModelo s){
        return repository.save(s);
    }
    
    @DeleteMapping("/socios/{id}")
    public void eliminarSocios(@PathVariable String id){
        repository.deleteById(id);
    }    
}
