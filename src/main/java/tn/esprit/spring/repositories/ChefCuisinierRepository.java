package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.ChefCuisinier;

public interface ChefCuisinierRepository extends JpaRepository<ChefCuisinier,Long> {
}
