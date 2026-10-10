package tn.esprit.autoloc_YasmineBenNaceur.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc_YasmineBenNaceur.Repositories.EquipementRepository;
import tn.esprit.autoloc_YasmineBenNaceur.entity.Equipement;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementService implements IEquipementService {
    private EquipementRepository equipementRepository;

    @Override
    public Equipement addEquipement(Equipement obj) {
        return equipementRepository.save(obj);
    }

    @Override
    public Equipement updateEquipement(Equipement obj) {
        return equipementRepository.save(obj);
    }

    @Override
    public void supprimerEquipement(Long id) {
        equipementRepository.deleteById(id);
    }

    @Override
    public List<Equipement> recupererEquipements() {
        return equipementRepository.findAll();
    }
}
