package tn.esprit.spring.entities;

import jakarta.persistence.*;
import tn.esprit.spring.entities.enums.TypeComposant;

@Entity
@Table
public class DetailComposant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailComposant;
    private float imc;
    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;
    @OneToOne
    @JoinColumn(name = "composant_id")
    private Composant composant;

    public DetailComposant(long idDetailComposant, float imc, TypeComposant typeComposant) {
        this.idDetailComposant = idDetailComposant;
        this.imc = imc;
        this.typeComposant = typeComposant;
    }

    public DetailComposant(float imc, TypeComposant typeComposant) {
        this.imc = imc;
        this.typeComposant = typeComposant;
    }

    public DetailComposant() {
    }

    public long getIdDetailComposant() {
        return idDetailComposant;
    }

    public void setIdDetailComposant(long idDetailComposant) {
        this.idDetailComposant = idDetailComposant;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public TypeComposant getTypeComposant() {
        return typeComposant;
    }

    public void setTypeComposant(TypeComposant typeComposant) {
        this.typeComposant = typeComposant;
    }

    @Override
    public String toString() {
        return "DetailComposant{" +
                "idDetailComposant=" + idDetailComposant +
                ", imc=" + imc +
                ", typeComposant=" + typeComposant +
                '}';
    }
}
