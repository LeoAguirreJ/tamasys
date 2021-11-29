package com.ciclo4.tamasys.controlador;

import com.ciclo4.tamasys.modelo.usuariosModelo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
public class usuariosControlador {
    
    @Autowired
    private MongoTemplate repository;
    
    @GetMapping("/consultarUsuario/{user}/{password}")
    public List<usuariosModelo> consultarUsuario(@PathVariable (value="user") String user, @PathVariable (value="password") String password){
        
        Query q = new Query();
        
        q.addCriteria(Criteria.where("user").is(user).and("password").is(password));
        
        return repository.find(q, usuariosModelo.class);
    }
    
}
