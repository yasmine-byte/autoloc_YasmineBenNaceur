package tn.esprit.autoloc_YasmineBenNaceur.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc_YasmineBenNaceur.Repositories.ContratRepository;
import tn.esprit.autoloc_YasmineBenNaceur.entity.Contrat;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContratService {
    private ContratRepository contratRepository;

    @Override
    public Contrat addContrat(Contrat obj) {
        return contratRepository.save(obj);
    }

    @Override
    public Contrat updateContrat(Contrat obj) {
        return contratRepository.save(obj);
    }

    @Override
    public void supprimerContrat(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public List<Contrat> recupererContrats() {
        return contratRepository.findAll();
    }
}
