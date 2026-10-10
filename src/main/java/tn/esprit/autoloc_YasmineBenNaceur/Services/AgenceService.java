package tn.esprit.autoloc_YasmineBenNaceur.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc_YasmineBenNaceur.Repositories.AgenceRepository;
import tn.esprit.autoloc_YasmineBenNaceur.entity.Agence;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService {
    private AgenceRepository agenceRepository;
    @Override
    public Agence addAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void supprimerAgence(Long id) {
         agenceRepository.deleteById(id);

    }

    @Override
    public List<Agence> recupererAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence updateAgences(Agence agence) {
        return agenceRepository.save(agence);
    }

}
