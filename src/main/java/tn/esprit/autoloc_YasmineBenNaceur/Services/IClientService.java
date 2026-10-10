package tn.esprit.autoloc_YasmineBenNaceur.Services;

import tn.esprit.autoloc_YasmineBenNaceur.entity.Client;

import java.util.List;

public interface IClientService {
    Client addClient(Client obj);
    Client updateClient(Client obj);
    void supprimerClient(Long id);
    List<Client> recupererClients();
}
