package tn.esprit.autoloc_YasmineBenNaceur.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc_YasmineBenNaceur.Repositories.ClientRepository;
import tn.esprit.autoloc_YasmineBenNaceur.entity.Client;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements IClientService {
    private ClientRepository clientRepository;

    @Override
    public Client addClient(Client obj) {
        return clientRepository.save(obj);
    }

    @Override
    public Client updateClient(Client obj) {
        return clientRepository.save(obj);
    }

    @Override
    public void supprimerClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> recupererClients() {
        return clientRepository.findAll();
    }
}
