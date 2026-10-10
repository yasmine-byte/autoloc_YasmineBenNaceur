package tn.esprit.autoloc_YasmineBenNaceur.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc_YasmineBenNaceur.Repositories.MaintenanceRepository;
import tn.esprit.autoloc_YasmineBenNaceur.entity.Maintenance;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceService implements IMaintenanceService {
    private MaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance addMaintenance(Maintenance obj) {
        return maintenanceRepository.save(obj);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance obj) {
        return maintenanceRepository.save(obj);
    }

    @Override
    public void supprimerMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }

    @Override
    public List<Maintenance> recupererMaintenances() {
        return maintenanceRepository.findAll();
    }
}
