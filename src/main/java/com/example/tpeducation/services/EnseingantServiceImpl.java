package com.example.tpeducation.services;

import com.example.tpeducation.entities.Enseignant;
import com.example.tpeducation.repositories.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnseingantServiceImpl implements  EnseignantService{
    @Autowired
    private  final EnseignantRepository enseignantRepository;

    public EnseingantServiceImpl(EnseignantRepository enseignantRepository) {
        this.enseignantRepository = enseignantRepository;
    }

    @Override
    public List<Enseignant> retrieveAllEnseigants() {
        List<Enseignant> enseignants = new ArrayList<>();
        enseignantRepository.findAll().forEach(enseignants::add);
        return enseignants;
    }


    @Override
    public Enseignant addEnseigant(Enseignant c) {
        enseignantRepository.save(c);
        return null;
    }

    @Override
    public void deleteEnseigant(Integer id) {
        enseignantRepository.deleteById(id);
    }

    @Override
    public Enseignant updateEnseigant(Enseignant c) {
        enseignantRepository.save(c);
        return null;
    }

    @Override
    public Enseignant retrieveEnseigant(Integer id) {
        enseignantRepository.findById(id);
        return null;
    }
}
