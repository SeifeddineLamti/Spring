package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.services.ComposantService;

@RestController
@AllArgsConstructor
public class ComposantController {
    private ComposantService composantService;
}
