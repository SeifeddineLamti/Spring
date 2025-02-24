package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.services.IComposantService;

@RestController
@AllArgsConstructor
public class ComposantController {
    private IComposantService composantService;
}
