package tn.esprit.autoloc_YasmineBenNaceur.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientRepository,Long> {
}

