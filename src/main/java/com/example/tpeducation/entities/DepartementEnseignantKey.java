package com.example.tpeducation.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class DepartementEnseignantKey implements Serializable {
    @Column(name = "departement_id")
    private Integer departement_id ;
    @Column(name="enseignant_id")
    private Integer enseignant_id ;

}
