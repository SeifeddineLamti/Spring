package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.services.CommandeService;

@RestController
@AllArgsConstructor
public class CommandeController {
    private CommandeService commandeService;
}
