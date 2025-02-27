package tn.esprit.spring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.repositories.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ClientService implements IClientService{
    private ClientRepository clientRepository;
    @Override
    public List<Client> retrieveAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client e) {
        return clientRepository.save(e);
    }

    @Override
    public Client updateClient(Client e) {
        return clientRepository.save(e);
    }

    @Override
    public List<Client> retrieveClient(Long idClient) {
        Optional<Client> client = clientRepository.findById(idClient);
        return (List<Client>) client.orElse(null);
    }

    @Override
    public void removeClient(Long idClient) {
        clientRepository.deleteById(idClient);
    }

    @Override
    public List<Client> addClients(List<Client> Clients) {
        return clientRepository.saveAll(Clients);
    }
}
