package com.company.repository;

import com.company.worker.ArrayWorker;
import com.company.worker.Printer;
import com.company.model.Client;
import com.company.model.Room;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by Алексей on 09.11.2017.
 */
public class RepositoryClient {

    public static Printer printer = new Printer();
    public Client[] clients;
    public Room[] rooms;

    public RepositoryClient() {
    }

    public RepositoryClient(Client[] clients, Room[] rooms) {
        this.clients = clients;
        this.rooms = rooms;
    }

    public void addClient(Client client, ArrayWorker arrayWorker) {


        if (arrayWorker.changeLength(clients) == true) {
            arrayWorker.addEntity(clients, arrayWorker.returnNumberFree(clients), client);

        } else {

            arrayWorker.expasionMassiv(clients);
            clients[clients.length - 1] = client;

        }


    }


    public void returnAllCountClients(Date date) {


        Integer count = 0;
        Printer printer = new Printer();
        for (int i = 0; i < clients.length; i++) {

            if (clients[i].getDateEviction().after(date) == true) {

                count++;

            }


        }
        printer.print(count.toString());
    }

    public void returnFinishPrice(Client client) {

        Double price = 0.0;
        Long countDate = client.getDateEviction().getTime() - client.getDateArrival().getTime();
        countDate = countDate / (24 * 60 * 60 * 1000);
        for (int i = 0; i < rooms.length; i++) {
            if (client.getID() != null) {
                if (client.getID() == rooms[i].getID())
                    price = rooms[i].getPrice();
            }

        }

        price = price * countDate;


        printer.print("Finish price = " + price);

    }


    public Client[] sortClient(Comparator clientComparator) {

        Client[] sortClient = clients;
        Arrays.sort(sortClient, clientComparator);
        return sortClient;

    }


    @Override
    public String toString() {
        return "RepositoryClient{" +
                "clients=" + Arrays.toString(clients) +
                '}';
    }
}

