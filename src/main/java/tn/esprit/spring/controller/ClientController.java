package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.services.IClientService;

@RestController
@AllArgsConstructor
public class ClientController {
    private IClientService clientService;
}
