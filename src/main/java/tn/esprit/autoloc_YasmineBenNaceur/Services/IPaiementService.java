package tn.esprit.autoloc_YasmineBenNaceur.Services;

import tn.esprit.autoloc_YasmineBenNaceur.entity.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement addPaiement(Paiement obj);
    Paiement updatePaiement(Paiement obj);
    void supprimerPaiement(Long id);
    List<Paiement> recupererPaiements();
}
