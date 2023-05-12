package com.example.tpeducation.repositories;

import com.example.tpeducation.entities.Enseignant;
import com.example.tpeducation.services.EnseignantService;
import com.example.tpeducation.services.EnseingantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tp")
public class EnseignantController {
    @Autowired
    private EnseignantService enseingantService;
    @GetMapping("/enseignants")
    public List<Enseignant> getEnseignant(){
        return enseingantService.retrieveAllEnseigants();
    }
    @PostMapping("/addEnseignants")
    public ResponseEntity<Enseignant> createEntity(@RequestBody Enseignant enseignant) {
        Enseignant createdEntity = enseingantService.addEnseigant(enseignant);
        return new ResponseEntity<>(createdEntity, HttpStatus.CREATED);
    }
}