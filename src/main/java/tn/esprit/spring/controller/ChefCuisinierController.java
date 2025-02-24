package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.services.ChefCuisinierService;

@RestController
@AllArgsConstructor
public class ChefCuisinierController {
    private ChefCuisinierService chefCuisinierService;
}
