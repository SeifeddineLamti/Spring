package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.services.DetailComposantService;

@RestController
@AllArgsConstructor
public class DetailComposantController {
    private DetailComposantService detailComposantService;
}
