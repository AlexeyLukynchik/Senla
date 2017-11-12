package com.company.manager;

import com.company.worker.ArrayWorker;
import com.company.model.Client;
import com.company.repository.RepositoryClient;
import com.company.repository.RepositoryRoom;

import java.util.Comparator;
import java.util.Date;

/**
 * Created by Алексей on 09.11.2017.
 */
public class ManagerClient {
    private RepositoryRoom rooms;
    private RepositoryClient clients;

    public ManagerClient(RepositoryRoom rooms, RepositoryClient clients) {
        this.rooms = rooms;
        this.clients = clients;
    }

    public void addClient(Client client, ArrayWorker arrayWorker) {


        clients.addClient(client, arrayWorker);


    }


    public void returnAllCountClients(Date date) {


        clients.returnAllCountClients(date);
    }

    public void returnFinishPrice(Client client) {

        clients.returnFinishPrice(client);

    }


    public Client[] sortClient(Comparator clientComparator) {

        return clients.sortClient(clientComparator);

    }


}


