package tn.esprit.autoloc_YasmineBenNaceur.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter

public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idAgence;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;
    @OneToMany(mappedBy = "agence")
    @JsonIgnore
    private Set<Employe> employes;

    @OneToMany(mappedBy = "agence")
    @JsonIgnore
    private Set<Vehicule> vehicules;
}