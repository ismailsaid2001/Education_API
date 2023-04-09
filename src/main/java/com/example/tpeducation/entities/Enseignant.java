package com.example.tpeducation.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Enseignant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String enseignantNom;
    private String enseignantPrenom;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEnseignantNom() {
        return enseignantNom;
    }
    public void setEnseignantNom(String enseignantNom) {
        this.enseignantNom = enseignantNom;
    }
    public String getEnseignantPrenom() {
        return enseignantPrenom;
    }
    public void setEnseignantPrenom(String enseignantPrenom) {
        this.enseignantPrenom = enseignantPrenom;
    }
    @OneToMany(mappedBy = "enseignant")
    private List<DepartementEnseignant> departementEnseignants;



}

