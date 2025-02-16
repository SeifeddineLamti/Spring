package tn.esprit.spring.services;

import tn.esprit.spring.entities.DetailComposant;

import java.util.List;

public interface IDetailComposantService {
    List<DetailComposant> retrieveAllDetails();
    DetailComposant addDetail(DetailComposant e);
    DetailComposant updateDetail(DetailComposant e);
    List<DetailComposant> retrieveDetail(Long idDetailComposant);
    void removeDetail(Long idDetailComposant);
    List<DetailComposant> addDetails(List<DetailComposant> details);
}
