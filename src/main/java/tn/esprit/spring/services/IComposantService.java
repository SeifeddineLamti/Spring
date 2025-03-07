package tn.esprit.spring.services;

import tn.esprit.spring.entities.Composant;

import java.util.List;

public interface IComposantService {
    List<Composant> retrieveAllComposants();
    Composant addComposant(Composant e);
    Composant updateComposant(Composant e);
    List<Composant> retrieveComposant(Long idComposant);
    void removeComposant(Long idComposant);
    List<Composant> addComposants(List<Composant> composants);
}
