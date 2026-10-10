package tn.esprit.autoloc_YasmineBenNaceur.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc_YasmineBenNaceur.Repositories.VehiculeRepository;
import tn.esprit.autoloc_YasmineBenNaceur.entity.Vehicule;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeService implements IVehiculeService {
    private VehiculeRepository vehiculeRepository;

    @Override
    public Vehicule addVehicule(Vehicule obj) {
        return vehiculeRepository.save(obj);
    }

    @Override
    public Vehicule updateVehicule(Vehicule obj) {
        return vehiculeRepository.save(obj);
    }

    @Override
    public void supprimerVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public List<Vehicule> recupererVehicules() {
        return vehiculeRepository.findAll();
    }
}
