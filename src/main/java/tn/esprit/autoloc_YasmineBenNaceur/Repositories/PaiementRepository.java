package tn.esprit.autoloc_YasmineBenNaceur.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc_YasmineBenNaceur.entity.Maintenance;
import tn.esprit.autoloc_YasmineBenNaceur.entity.Paiement;

@Repository
public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}

