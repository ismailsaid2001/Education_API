package com.example.tpeducation.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class DepartementEnseignant implements Serializable {
    @EmbeddedId
    private DepartementEnseignantKey id;
    @ManyToOne
    @MapsId("departement_id")
    private Departement departement;
    @ManyToOne
    @MapsId("enseignant_id")
    private Enseignant enseignant;
}
