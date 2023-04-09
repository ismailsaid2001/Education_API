package com.example.tpeducation.entities;
import javax.persistence.*;
import java.util.List;

@Entity
public class Departement {

    @Id
    private Long idL;
    private String nom;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    @ManyToOne
    private  University university ;
    @OneToMany(mappedBy = "departement")
    private List<DepartementEnseignant> departementEnseignant;
}