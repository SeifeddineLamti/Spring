package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
}
