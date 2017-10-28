package com.company.worker;

import com.company.essence.*;
import com.company.repository.*;

/**
 * Created by Алексей on 25.10.2017.
 */
public class ArrayWorker {

    public Entity[] expasionMassiv(Entity[] entities){

        Entity[] newEntity = new Entity[entities.length+1];

        System.arraycopy(entities, 0, newEntity, 0, entities.length);

        return newEntity;

    }

    public Entity[] addEntity(Entity[] entities , Integer num, Entity entity){

        entities[num] = entity;
        return entities;


    }
    public Entity[] addService(HistoryService[] entities , Integer num, HistoryService entity){

        entities[num] = entity;
        return entities;


    }

public boolean changeLength (Entity[] entities){

    boolean length = false;

    for (int i = 0; i<entities.length;i++){
        if(entities[i] == null){

            length = true;
            break;
        }

    }

    return length;
}

public Integer returnNumberFree(Entity[] entities) {

    Integer number = -1 ;
    for (int i = 0; i < entities.length; i++) {
        if (entities[i] == null){
            number = i;
            break;


    }

}
    return number;
}

public Room[] decrease(Room[] entities){

    Integer newCount = 0;


    Room[] newEntity  ;

    for (int i = 0; i<entities.length;i++){
        if(entities[i] != null)
            newCount++;
    }
    newEntity = new Room[newCount];

    for (int i = 0; i<entities.length;i++) {
        if (entities[i] != null)
            newEntity[i] = entities[i];
    }

return newEntity;

}
public Client[] decreaseClients(Client[] entities){
    Integer newCount = 0;


    Client[] newEntity  ;

    for (int i = 0; i<entities.length;i++){
        if(entities[i] != null)
            newCount++;
    }
    newEntity = new Client[newCount];

    for (int i = 0; i<entities.length;i++) {
        if (entities[i] != null)
            newEntity[i] = entities[i];
    }

  return newEntity;
}
    public Service[] decreaseService(Service[] entities){
        Integer newCount = 0;


       Service[] newEntity  ;

        for (int i = 0; i<entities.length;i++){
            if(entities[i] != null)
                newCount++;
        }
        newEntity = new Service[newCount];

        for (int i = 0; i<entities.length;i++) {
            if (entities[i] != null)
                newEntity[i] = entities[i];
        }

        return newEntity;
    }
    public HistoryService[] decreaseHistoryService(HistoryService[] entities){
        Integer newCount = 0;


        HistoryService[] newEntity  ;

        for (int i = 0; i<entities.length;i++){
            if(entities[i] != null)
                newCount++;
        }
        newEntity = new HistoryService[newCount];

        for (int i = 0; i<entities.length;i++) {
            if (entities[i] != null)
                newEntity[i] = entities[i];
        }

        return newEntity;

    }
    public HistoryHotel[] decreaseHistoryHotel(HistoryHotel[] entities){
        Integer newCount = 0;


        HistoryHotel[] newEntity  ;

        for (int i = 0; i<entities.length;i++){
            if(entities[i] != null)
                newCount++;
        }
        newEntity = new HistoryHotel[newCount];

        for (int i = 0; i<entities.length;i++) {
            if (entities[i] != null)
                newEntity[i] = entities[i];
        }

        return newEntity;

    }

    public Integer returnNumber(RepositoryRoom repositoryRoom, Integer num){

        Integer count = 0;
        for (int i =0; i<repositoryRoom.getRooms().length;i++){
            if(repositoryRoom.getRooms()[i].getNumber() == num)
            {
                count = i;
            }

        }

        return count;

    }
    public Integer returnNumClient(RepositoryClient repositoryClient, String surname){


        Integer count = 0;
        for (int i = 0; i<repositoryClient.getClients().length;i++){
            if(repositoryClient.getClients()[i].getSurname().equals(surname)){

                count = i;
            }


        }

return count;
    }
    public Integer returnNumService(RepositoryService repositoryService, String name){

        Integer count = 0;
        for (int i = 0; i<repositoryService.getServices().length;i++){
            if(repositoryService.getServices()[i].getName().equals(name)){
                count = i;

            }
        }


        return count;

    }

    public Integer returnHistory(RepositoryHistoryHotel historyHotel, Integer num){
        Integer count = 0;
        for (int i = 0; i<historyHotel.getHistoryHotels().length;i++){

            if(historyHotel.getHistoryHotels()[i].getNumberRoom() == num){
                count = i;
            }

        }
        return count;
    }

}