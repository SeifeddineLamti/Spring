package tn.esprit.spring.entities;

import jakarta.persistence.*;
import tn.esprit.spring.entities.enums.TypeMenu;

import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Menu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;
    private String libelleMenu;
    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;
    private Float prixTotal;
    @OneToMany(mappedBy = "menu")
    private List<Composant> composants;
    @OneToMany(mappedBy = "menu")
    private List<Commande> commandes;
    @ManyToMany
    private List<ChefCuisinier> chefCuisiniers;


    public Menu(long idMenu, String libelleMenu, TypeMenu typeMenu, float prixTotal) {
        this.idMenu = idMenu;
        this.libelleMenu = libelleMenu;
        this.typeMenu = typeMenu;
        this.prixTotal = prixTotal;
    }

    public Menu(String libelleMenu, TypeMenu typeMenu, float prixTotal) {
        this.libelleMenu = libelleMenu;
        this.typeMenu = typeMenu;
        this.prixTotal = prixTotal;
    }

    public Menu() {
    }

    public long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(long idMenu) {
        this.idMenu = idMenu;
    }

    public String getLibelleMenu() {
        return libelleMenu;
    }

    public void setLibelleMenu(String libelleMenu) {
        this.libelleMenu = libelleMenu;
    }

    public TypeMenu getTypeMenu() {
        return typeMenu;
    }

    public void setTypeMenu(TypeMenu typeMenu) {
        this.typeMenu = typeMenu;
    }

    public float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(float prixTotal) {
        this.prixTotal = prixTotal;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "idMenu=" + idMenu +
                ", libelleMenu='" + libelleMenu + '\'' +
                ", typeMenu=" + typeMenu +
                ", prixTotal=" + prixTotal +
                '}';
    }
}
