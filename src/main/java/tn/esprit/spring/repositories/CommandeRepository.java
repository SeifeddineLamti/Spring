package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.entities.Commande;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
    List<Commande> findByClientIdClient(Long idClient);
    List<Commande> findByClientIdClientAndDateCommandeBetween(Long idClient, LocalDate d1, LocalDate d2);
    List<Commande> findByDateCommandeBetweenOrderByNoteAscTotalCommandeAsc(LocalDate d1, LocalDate d2);
}
