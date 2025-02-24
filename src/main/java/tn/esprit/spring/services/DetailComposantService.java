package tn.esprit.spring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.DetailComposant;
import tn.esprit.spring.repositories.DetailComposantRepository;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class DetailComposantService implements IDetailComposantService{
    private DetailComposantRepository detailComposantRepository;

    @Override
    public List<DetailComposant> retrieveAllDetails() {
        return detailComposantRepository.findAll();
    }

    @Override
    public DetailComposant addDetail(DetailComposant e) {
        return detailComposantRepository.save(e);
    }

    @Override
    public DetailComposant updateDetail(DetailComposant e) {
        return detailComposantRepository.save(e);
    }

    @Override
    public List<DetailComposant> retrieveDetail(Long idDetailComposant) {
        Optional<DetailComposant> detailComposant = detailComposantRepository.findById(idDetailComposant);
        return detailComposant.map(List::of).orElse(null);
    }

    @Override
    public void removeDetail(Long idDetailComposant) {
        detailComposantRepository.deleteById(idDetailComposant);
    }

    @Override
    public List<DetailComposant> addDetails(List<DetailComposant> details) {
        return detailComposantRepository.saveAll(details);
    }
}
