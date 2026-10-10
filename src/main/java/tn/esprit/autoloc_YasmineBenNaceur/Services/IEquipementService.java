package tn.esprit.autoloc_YasmineBenNaceur.Services;

import tn.esprit.autoloc_YasmineBenNaceur.entity.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement addEquipement(Equipement obj);
    Equipement updateEquipement(Equipement obj);
    void supprimerEquipement(Long id);
    List<Equipement> recupererEquipements();
}
