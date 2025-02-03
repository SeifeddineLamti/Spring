package tn.esprit.spring.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table
public class Commande implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;
    private LocalDate dateCommande;
    private Integer pourcentageRemise;
    private Float totalRemise;
    private Float totalCommande;
    private Long note;
    @ManyToOne
    private Client client;

    @ManyToOne
    private Menu menu;


    public Commande() {
    }

    public Commande(LocalDate dateCommande, int pourcentageRemise, float totalRemise, float totalCommande, long note) {
        this.dateCommande = dateCommande;
        this.pourcentageRemise = pourcentageRemise;
        this.totalRemise = totalRemise;
        this.totalCommande = totalCommande;
        this.note = note;
    }

    public Commande(long idCommande, LocalDate dateCommande, int pourcentageRemise, float totalRemise, float totalCommande, long note) {
        this.idCommande = idCommande;
        this.dateCommande = dateCommande;
        this.pourcentageRemise = pourcentageRemise;
        this.totalRemise = totalRemise;
        this.totalCommande = totalCommande;
        this.note = note;
    }

    public long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(long idCommande) {
        this.idCommande = idCommande;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public int getPourcentageRemise() {
        return pourcentageRemise;
    }

    public void setPourcentageRemise(int pourcentageRemise) {
        this.pourcentageRemise = pourcentageRemise;
    }

    public float getTotalRemise() {
        return totalRemise;
    }

    public void setTotalRemise(float totalRemise) {
        this.totalRemise = totalRemise;
    }

    public float getTotalCommande() {
        return totalCommande;
    }

    public void setTotalCommande(float totalCommande) {
        this.totalCommande = totalCommande;
    }

    public long getNote() {
        return note;
    }

    public void setNote(long note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "idCommande=" + idCommande +
                ", dateCommande=" + dateCommande +
                ", pourcentageRemise=" + pourcentageRemise +
                ", totalRemise=" + totalRemise +
                ", totalCommande=" + totalCommande +
                ", note=" + note +
                '}';
    }
}
