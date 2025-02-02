package tn.esprit.spring.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@Table
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClient;
    private String identifiant;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "UTC")
    private Date datePremiereVisite;
    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;
    public Client(long idClient, String identifiant, Date datePremiereVisite) {
        this.idClient = idClient;
        this.identifiant = identifiant;
        this.datePremiereVisite = datePremiereVisite;
    }

    public Client(String identifiant, Date datePremiereVisite) {
        this.identifiant = identifiant;
        this.datePremiereVisite = datePremiereVisite;
    }

    public Client() {
    }

    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public Date getDatePremiereVisite() {
        return datePremiereVisite;
    }

    public void setDatePremiereVisite(Date datePremiereVisite) {
        this.datePremiereVisite = datePremiereVisite;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", identifiant='" + identifiant + '\'' +
                ", datePremiereVisite=" + datePremiereVisite +
                '}';
    }
}
