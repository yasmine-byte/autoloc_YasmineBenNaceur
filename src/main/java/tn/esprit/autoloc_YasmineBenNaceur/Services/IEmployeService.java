package tn.esprit.autoloc_YasmineBenNaceur.Services;

import tn.esprit.autoloc_YasmineBenNaceur.entity.Employe;

import java.util.List;

public interface IEmployeService {
    Employe addEmploye(Employe obj);
    Employe updateEmploye(Employe obj);
    void supprimerEmploye(Long id);
    List<Employe> recupererEmployes();
}
