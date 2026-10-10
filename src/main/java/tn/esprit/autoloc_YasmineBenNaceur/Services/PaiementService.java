package tn.esprit.autoloc_YasmineBenNaceur.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc_YasmineBenNaceur.Repositories.PaiementRepository;
import tn.esprit.autoloc_YasmineBenNaceur.entity.Paiement;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementService implements IPaiementService {
    private PaiementRepository paiementRepository;

    @Override
    public Paiement addPaiement(Paiement obj) {
        return paiementRepository.save(obj);
    }

    @Override
    public Paiement updatePaiement(Paiement obj) {
        return paiementRepository.save(obj);
    }

    @Override
    public void supprimerPaiement(Long id) {
        paiementRepository.deleteById(id);
    }

    @Override
    public List<Paiement> recupererPaiements() {
        return paiementRepository.findAll();
    }
}
