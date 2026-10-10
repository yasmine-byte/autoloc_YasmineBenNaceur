package tn.esprit.autoloc_YasmineBenNaceur.Services;

import tn.esprit.autoloc_YasmineBenNaceur.entity.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance addMaintenance(Maintenance obj);
    Maintenance updateMaintenance(Maintenance obj);
    void supprimerMaintenance(Long id);
    List<Maintenance> recupererMaintenances();
}
