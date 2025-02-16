package tn.esprit.spring.services;

import tn.esprit.spring.entities.ChefCuisinier;

import java.util.List;

public interface IChefCuisinierService {
    List<ChefCuisinier> retrieveAllChefs();
    ChefCuisinier addChef(ChefCuisinier e);
    ChefCuisinier updateChef(ChefCuisinier e);
    List<ChefCuisinier> retrieveChef(Long idChef);
    void removeChef(Long idChef);
    List<ChefCuisinier> addChefs(List<ChefCuisinier> chefs);
}
