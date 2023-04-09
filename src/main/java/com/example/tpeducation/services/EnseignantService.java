package com.example.tpeducation.services;

import com.example.tpeducation.entities.Enseignant;
import com.example.tpeducation.repositories.EnseignantRepository;

import java.util.List;

public interface EnseignantService {
    List<Enseignant> retrieveAllEnseigannts();
    Enseignant addEnseigant(Enseignant c);
    void deleteEnseigant(Integer id);
    Enseignant updateEnseigant(Enseignant c);
    Enseignant retrieveEnseigant(Integer id);
}
