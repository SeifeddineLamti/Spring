package tn.esprit.spring.services;

import tn.esprit.spring.entities.ChaineRestauration;
import tn.esprit.spring.repositories.ChaineRestaurationRepository;

import java.util.List;
import java.util.Optional;

public class ChaineRestaurantService implements IChaineRestaurationService{
    private final ChaineRestaurationRepository chaineRestaurationRepository;

    public ChaineRestaurantService(ChaineRestaurationRepository chaineRestaurationRepository) {
        this.chaineRestaurationRepository = chaineRestaurationRepository;
    }

    @Override
    public List<ChaineRestauration> retrieveAllChaines() {
        return chaineRestaurationRepository.findAll();
    }

    @Override
    public ChaineRestauration addChaine(ChaineRestauration e) {
        return chaineRestaurationRepository.save(e);
    }

    @Override
    public ChaineRestauration updateChaine(ChaineRestauration e) {
        return chaineRestaurationRepository.save(e);
    }

    @Override
    public List<ChaineRestauration> retrieveChaine(Long idChaine) {
        Optional<ChaineRestauration> chaine = chaineRestaurationRepository.findById(idChaine);
        return chaine.map(List::of).orElse(null);
    }

    @Override
    public void removeChaine(Long idChaine) {
        chaineRestaurationRepository.deleteById(idChaine);
    }

    @Override
    public List<ChaineRestauration> addChaines(List<ChaineRestauration> chaines) {
        return chaineRestaurationRepository.saveAll(chaines);
    }
}
