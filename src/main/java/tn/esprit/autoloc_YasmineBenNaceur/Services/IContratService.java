package tn.esprit.autoloc_YasmineBenNaceur.Services;

import tn.esprit.autoloc_YasmineBenNaceur.entity.Contrat;

import java.util.List;

public interface IContratService {
    Contrat addContrat(Contrat obj);
    Contrat updateContrat(Contrat obj);
    void supprimerContrat(Long id);
    List<Contrat> recupererContrats();
}
