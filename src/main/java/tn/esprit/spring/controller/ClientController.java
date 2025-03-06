package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.services.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientController {
    private IClientService clientService;
    @GetMapping("/retrieve-all-clients")
    public List<Client> getClients() {
        List<Client> listClients = clientService.retrieveAllClients();
        return listClients;
}
    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client c) {
        Client client = clientService.addClient(c);
        return client;
    }
    @GetMapping("/retrieve-client/{client-id}")
    public Client retrieveClient(@PathVariable("client-id") Long clientId) {
        return clientService.retrieveClient(clientId);
    }
    @PutMapping("/update-client")
    public Client updateClient(@RequestBody Client c) {
        Client client= clientService.updateClient(c);
        return client;
    }
    @DeleteMapping("/remove-client/{client-id}")
    public void removeClient(@PathVariable("client-id") Long clientId) {
        clientService.removeClient(clientId);
    }


}
