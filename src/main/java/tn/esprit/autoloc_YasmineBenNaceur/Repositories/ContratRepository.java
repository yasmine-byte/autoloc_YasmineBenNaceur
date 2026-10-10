package tn.esprit.autoloc_YasmineBenNaceur.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc_YasmineBenNaceur.entity.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long> {
}