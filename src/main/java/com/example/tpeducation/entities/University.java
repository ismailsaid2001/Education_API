package com.example.tpeducation.entities;
import javax.persistence.*;

import org.hibernate.result.NoMoreReturnsException;

import java.io.Serializable;
import java.util.List;

@Entity
public class University implements Serializable {

    @Id
    private Long id;
    private String nom;
    private String address;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @OneToMany(mappedBy ="university",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Departement> departements;
    @OneToMany(mappedBy ="university",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Etudiant> etudiants;

}

