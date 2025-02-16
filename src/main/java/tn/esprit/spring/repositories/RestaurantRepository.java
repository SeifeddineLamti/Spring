package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
}
