package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.services.ChaineRestaurantService;

@RestController
@AllArgsConstructor
public class ChaineRestaurationController {
    private ChaineRestaurantService chaineRestaurantService;
}
