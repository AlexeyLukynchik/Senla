package com.company.worker;

import com.company.model.*;

import com.company.repository.RepositoryClient;
import com.company.repository.RepositoryHistoryHotel;
import com.company.repository.RepositoryRoom;
import com.company.repository.RepositoryService;


public class ArrayWorker {

    public Entity[] expasionMassiv(Entity[] entities) {

        Entity[] newEntity = new Entity[entities.length * 2];

        System.arraycopy(entities, 0, newEntity, 0, entities.length);

        return newEntity;

    }

    public Entity[] addEntity(Entity[] entities, Integer num, Entity entity) {

        entities[num] = entity;
        return entities;


    }

    public Entity[] addService(HistoryService[] entities, Integer num, HistoryService entity) {

        entities[num] = entity;
        return entities;


    }

    public boolean changeLength(Entity[] entities) {

        boolean length = false;

        for (int i = 0; i < entities.length; i++) {
            if (entities[i] == null) {

                length = true;
                break;
            }

        }

        return length;
    }

    public Integer returnNumberFree(Entity[] entities) {

        Integer number = -1;
        for (int i = 0; i < entities.length; i++) {
            if (entities[i] == null) {
                number = i;
                break;


            }

        }
        return number;
    }

    public Integer returnNumber(Room[] room, Integer num) {

        Integer count = 0;
        for (int i = 0; i < room.length; i++) {
            if (room[i].getNumber() == num) {
                count = i;
            }

        }

        return count;

    }


}