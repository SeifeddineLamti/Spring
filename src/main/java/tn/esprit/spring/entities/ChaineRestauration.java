package tn.esprit.spring.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table
public class ChaineRestauration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChaineRestauration;
    private String libelle;
    private LocalDate dateCreation;
    @OneToMany(mappedBy = "chaineRestauration", cascade = CascadeType.ALL)
    private List<Restaurant> restaurants;

    public ChaineRestauration(long idChaineRestauration, String libelle, LocalDate dateCreation) {
        this.idChaineRestauration = idChaineRestauration;
        this.libelle = libelle;
        this.dateCreation = dateCreation;
    }

    public ChaineRestauration(String libelle, LocalDate dateCreation) {
        this.libelle = libelle;
        this.dateCreation = dateCreation;
    }

    public ChaineRestauration() {
    }

    public long getIdChaineRestauration() {
        return idChaineRestauration;
    }

    public void setIdChaineRestauration(long idChaineRestauration) {
        this.idChaineRestauration = idChaineRestauration;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "ChaineRestauration{" +
                "idChaineRestauration=" + idChaineRestauration +
                ", libelle='" + libelle + '\'' +
                ", dateCreation=" + dateCreation +
                '}';
    }
}
