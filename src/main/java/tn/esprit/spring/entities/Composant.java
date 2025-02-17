package tn.esprit.spring.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table
public class Composant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComposant;
    private String nomComposant;
    private Float prix;
    @ManyToOne
    private Menu menu;

    @OneToOne
    private DetailComposant detailComposant;

    public Composant(long idComposant, String nomComposant, float prix) {
        this.idComposant = idComposant;
        this.nomComposant = nomComposant;
        this.prix = prix;
    }

    public Composant(String nomComposant, float prix) {
        this.nomComposant = nomComposant;
        this.prix = prix;
    }

    public Composant() {
    }

    public long getIdComposant() {
        return idComposant;
    }

    public void setIdComposant(long idComposant) {
        this.idComposant = idComposant;
    }

    public String getnomComposant() {
        return nomComposant;
    }

    public void setnomComposant(String nomComposant) {
        this.nomComposant = nomComposant;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Composant{" +
                "idComposant=" + idComposant +
                ", nomComposant='" + nomComposant + '\'' +
                ", prix=" + prix +
                '}';
    }
}
