package com.company.repository;

import com.company.essence.Client;
import com.company.essence.Entity;

import java.util.Arrays;


public class RepositoryClient extends RepositoryEntity {

    private Client[] clients;

    public RepositoryClient() {
        this.clients = new Client[7];
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    @Override
    Entity[] getEntity() {
        return clients;
    }

    @Override
    public String toString() {
        return "RepositoryClient{" +
                "clients=" + Arrays.toString(clients) +
                '}';
    }
}
