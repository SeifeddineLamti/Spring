package tn.esprit.spring.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCommande;
    private LocalDate dateCommande;
    private int pourcentageRemise;
    private float totalRemise;
    private float totalCommande;
    private long note;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    @ManyToOne
    @JoinColumn(name = "chef_cuisinier_id")
    private ChefCuisinier chefCuisinier;

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
