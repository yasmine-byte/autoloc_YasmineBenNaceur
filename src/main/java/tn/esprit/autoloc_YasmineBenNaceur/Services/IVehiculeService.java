package tn.esprit.autoloc_YasmineBenNaceur.Services;

import tn.esprit.autoloc_YasmineBenNaceur.entity.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule addVehicule(Vehicule obj);
    Vehicule updateVehicule(Vehicule obj);
    void supprimerVehicule(Long id);
    List<Vehicule> recupererVehicules();
}
