package tn.esprit.spring.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idComposant;
    private String comComposant;
    private float prix;
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;

    @OneToOne(mappedBy = "composant", cascade = CascadeType.ALL)
    private DetailComposant detailComposant;

    public Composant(long idComposant, String comComposant, float prix) {
        this.idComposant = idComposant;
        this.comComposant = comComposant;
        this.prix = prix;
    }

    public Composant(String comComposant, float prix) {
        this.comComposant = comComposant;
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

    public String getComComposant() {
        return comComposant;
    }

    public void setComComposant(String comComposant) {
        this.comComposant = comComposant;
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
                ", comComposant='" + comComposant + '\'' +
                ", prix=" + prix +
                '}';
    }
}
