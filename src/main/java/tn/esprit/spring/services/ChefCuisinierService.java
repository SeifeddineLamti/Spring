package tn.esprit.spring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.ChefCuisinier;
import tn.esprit.spring.repositories.ChefCuisinierRepository;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class ChefCuisinierService implements IChefCuisinierService{
    private ChefCuisinierRepository chefCuisinierRepository;


    @Override
    public List<ChefCuisinier> retrieveAllChefs() {
        return chefCuisinierRepository.findAll();
    }

    @Override
    public ChefCuisinier addChef(ChefCuisinier e) {
        return chefCuisinierRepository.save(e);
    }

    @Override
    public ChefCuisinier updateChef(ChefCuisinier e) {
        return chefCuisinierRepository.save(e);
    }

    @Override
    public ChefCuisinier retrieveChef(Long idChef) {
        Optional<ChefCuisinier> chef = chefCuisinierRepository.findById(idChef);
        return chef.orElse(null);
    }

    @Override
    public void removeChef(Long idChef) {
        chefCuisinierRepository.deleteById(idChef);
    }

    @Override
    public List<ChefCuisinier> addChefs(List<ChefCuisinier> chefs) {
        return chefCuisinierRepository.saveAll(chefs);
    }
}
