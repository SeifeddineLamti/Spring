package tn.esprit.spring.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRestaurant;
    private String nom;
    private long nbPlacesMax;
    @ManyToOne
    @JoinColumn(name = "chaine_restauration_id")
    private ChaineRestauration chaineRestauration;

    @OneToMany(mappedBy = "restaurant")
    private List<Menu> menus;

    public Restaurant(long idRestaurant, String nom, long nbPlacesMax) {
        this.idRestaurant = idRestaurant;
        this.nom = nom;
        this.nbPlacesMax = nbPlacesMax;
    }

    public Restaurant(String nom, long nbPlacesMax) {
        this.nom = nom;
        this.nbPlacesMax = nbPlacesMax;
    }

    public Restaurant() {
    }

    public long getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(long idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getNbPlacesMax() {
        return nbPlacesMax;
    }

    public void setNbPlacesMax(long nbPlacesMax) {
        this.nbPlacesMax = nbPlacesMax;
    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "idRestaurant=" + idRestaurant +
                ", nom='" + nom + '\'' +
                ", nbPlacesMax=" + nbPlacesMax +
                '}';
    }
}
