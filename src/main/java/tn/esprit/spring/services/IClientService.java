package tn.esprit.spring.services;

import tn.esprit.spring.entities.Client;

import java.util.List;

public interface IClientService {
    List<Client> retrieveAllClients();
    Client addClient(Client e);
    Client updateClient(Client e);
    List<Client> retrieveClient(Long idClient);
    void removeClient(Long idClient);
    List<Client> addClients (List<Client> Clients);
}
