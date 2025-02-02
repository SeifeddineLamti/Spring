package tn.esprit.spring.entities;

import jakarta.persistence.*;
import tn.esprit.spring.entities.enums.TypeChef;

import java.util.List;

@Entity
@Table
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChefCuisinier;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;
    @OneToMany(mappedBy = "chefCuisinier")
    private List<Commande> commandes;

    public ChefCuisinier(long idChefCuisinier, String nom, String prenom, TypeChef typeChef) {
        this.idChefCuisinier = idChefCuisinier;
        this.nom = nom;
        this.prenom = prenom;
        this.typeChef = typeChef;
    }

    public ChefCuisinier(String nom, String prenom, TypeChef typeChef) {
        this.nom = nom;
        this.prenom = prenom;
        this.typeChef = typeChef;
    }

    public ChefCuisinier() {
    }

    public long getIdChefCuisinier() {
        return idChefCuisinier;
    }

    public void setIdChefCuisinier(long idChefCuisinier) {
        this.idChefCuisinier = idChefCuisinier;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public TypeChef getTypeChef() {
        return typeChef;
    }

    public void setTypeChef(TypeChef typeChef) {
        this.typeChef = typeChef;
    }

    @Override
    public String toString() {
        return "ChefCuisinier{" +
                "idChefCuisinier=" + idChefCuisinier +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", typeChef=" + typeChef +
                '}';
    }
}
