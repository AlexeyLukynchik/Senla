package com.company.manager;

import com.company.worker.ArrayWorker;
import com.company.worker.Printer;
import com.company.essence.Client;
import com.company.repository.RepositoryClient;
import com.company.repository.RepositoryRoom;

import java.util.Date;

/**
 * Created by Алексей on 25.10.2017.
 */
public class ManagerClient {

    public void addClient(Client client, RepositoryClient repositoryClient, ArrayWorker arrayWorker){


        if(arrayWorker.changeLength(repositoryClient.getClients())== true)
        {
            arrayWorker.addEntity(repositoryClient.getClients(),arrayWorker.returnNumberFree(repositoryClient.getClients()),client);

        }
        else
        {

            arrayWorker.expasionMassiv(repositoryClient.getClients());
            repositoryClient.getClients()[repositoryClient.getClients().length-1] = client;

        }



    }



    public void returnAllCountClients(RepositoryClient repositoryClient, Date date){


        Integer count = 0;
        Printer printer = new Printer();
        for (int i = 0;i<repositoryClient.getClients().length;i++){

            if (repositoryClient.getClients()[i].getDateEviction().after(date)== true){

                count++;

            }


        }
        printer.print(count.toString());
    }

public void returnFinishPrice(Client client,RepositoryRoom repositoryRoom){

    Double price = 0.0;
    Long countDate = client.getDateEviction().getTime() - client.getDateArrival().getTime();
    countDate = countDate/(24 * 60 * 60 * 1000);
    for (int i = 0; i<repositoryRoom.getRooms().length;i++)
    {
        if(client.getNumberRoom() == repositoryRoom.getRooms()[i].getNumber())
            price = repositoryRoom.getRooms()[i].getPrice();


    }

    price = price * countDate;

    Printer printer = new Printer();

    printer.print("Finish price = " + price);

}


}
