package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.DetailComposant;

public interface DetailComposantRepository extends JpaRepository<DetailComposant,Long> {
}
