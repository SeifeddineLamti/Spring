package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.Composant;

public interface ComposantRepository extends JpaRepository<Composant,Long> {
}
