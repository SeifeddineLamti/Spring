package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.Menu;

public interface MenuRepository  extends JpaRepository<Menu,Long> {
}
