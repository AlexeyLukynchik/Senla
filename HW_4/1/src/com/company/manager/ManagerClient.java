package com.company.manager;

import com.company.worker.ArrayWorker;
import com.company.worker.Printer;
import com.company.essence.Client;
import com.company.repository.RepositoryClient;
import com.company.repository.RepositoryRoom;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;


public class ManagerClient {

    private RepositoryClient clients;

    public RepositoryClient getClients() {
        return clients;
    }

    public void setClients(RepositoryClient clients) {
        this.clients = clients;
    }

    private RepositoryRoom rooms;

    public RepositoryRoom getRooms() {
        return rooms;
    }

    public void setRooms(RepositoryRoom rooms) {
        this.rooms = rooms;
    }

    public ManagerClient(RepositoryClient clients, RepositoryRoom rooms) {
        this.clients = clients;
        this.rooms = rooms;
    }

    public void addClient(Client client, ArrayWorker arrayWorker) {


        if (arrayWorker.changeLength(getClients().getClients()) == true) {
            arrayWorker.addEntity(getClients().getClients(), arrayWorker.returnNumberFree(getClients().getClients()), client);

        } else {

            arrayWorker.expasionMassiv(getClients().getClients());
            getClients().getClients()[getClients().getClients().length - 1] = client;

        }


    }


    public void returnAllCountClients(Date date) {


        Integer count = 0;
        Printer printer = new Printer();
        for (int i = 0; i < getClients().getClients().length; i++) {

            if (getClients().getClients()[i].getDateEviction().after(date) == true) {

                count++;

            }


        }
        printer.print(count.toString());
    }

    public void returnFinishPrice(Client client) {

        Double price = 0.0;
        Long countDate = client.getDateEviction().getTime() - client.getDateArrival().getTime();
        countDate = countDate / (24 * 60 * 60 * 1000);
        for (int i = 0; i < getRooms().getRooms().length; i++) {
            if (client.getID() == getRooms().getRooms()[i].getNumber())
                price = getRooms().getRooms()[i].getPrice();


        }

        price = price * countDate;

        Printer printer = new Printer();

        printer.print("Finish price = " + price);

    }


    public Client[] sortClient(Comparator clientComparator) {

        Client[] sortClient = getClients().getClients();
        Arrays.sort(sortClient, clientComparator);
        return sortClient;

    }


}
