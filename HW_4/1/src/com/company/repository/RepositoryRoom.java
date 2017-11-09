package com.company.repository;

import com.company.essence.Entity;
import com.company.essence.Room;

import java.util.Arrays;


public class RepositoryRoom extends RepositoryEntity {

    private Room[] rooms;
    private Room[] freeRooms;

    public Room[] getFreeRooms() {
        return freeRooms;
    }

    public void setFreeRooms(Room[] freeRooms) {
        this.freeRooms = freeRooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public RepositoryRoom(Room[] freeRooms) {
        this.rooms = new Room[7];
        this.freeRooms = freeRooms;
    }

    @Override
    Entity[] getEntity() {
        return rooms;
    }

    @Override
    public String toString() {
        return "RepositoryRoom{" +
                "rooms=" + Arrays.toString(rooms) +
                ", freeRooms=" + Arrays.toString(freeRooms) +
                '}';
    }
}
