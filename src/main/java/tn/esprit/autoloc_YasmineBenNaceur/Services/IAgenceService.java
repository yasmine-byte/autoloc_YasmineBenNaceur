package tn.esprit.autoloc_YasmineBenNaceur.Services;

import tn.esprit.autoloc_YasmineBenNaceur.entity.Agence;

import java.util.List;

public interface IAgenceService {
    Agence addAgence(Agence agence);
    Agence updateAgence(Agence agence);
    void supprimerAgence(Long id);
    List<Agence> recupererAgences();
    Agence updateAgences( Agence agence );
}
