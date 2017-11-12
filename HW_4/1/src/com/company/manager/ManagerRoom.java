package com.company.manager;

import com.company.worker.ArrayWorker;
import com.company.model.*;

import com.company.repository.RepositoryClient;
import com.company.repository.RepositoryRoom;


import java.text.ParseException;

import java.util.Comparator;
import java.util.Date;


public class ManagerRoom {
    private RepositoryRoom rooms;
    private RepositoryClient clients;

    public RepositoryClient getClients() {
        return clients;
    }

    public void setClients(RepositoryClient clients) {
        this.clients = clients;
    }

    public RepositoryRoom getRooms() {
        return rooms;
    }

    public void setRooms(RepositoryRoom rooms) {
        this.rooms = rooms;
    }

    public ManagerRoom(RepositoryRoom rooms, RepositoryClient clients) {
        this.rooms = rooms;
        this.clients = clients;
    }

    public Room occupance(Client client, Integer integer, ArrayWorker arrayWorker, HistoryHotel historyHotel) {


        return rooms.occupance(client, integer, arrayWorker, historyHotel);


    }

    public Room eviction(HistoryHotel historyHotel, Integer integer, ArrayWorker arrayWorker) throws ParseException {


        return rooms.eviction(historyHotel, integer, arrayWorker);

    }

    public Room[] sortRoom(Comparator comparator) {

        return rooms.sortRoom(comparator);
    }

    public Room changeStatus(Room room, String status) {


        return rooms.changeStatus(room, status);

    }


    public Room changePrice(Room room, Double newPrice) {


        return rooms.changePrice(room, newPrice);
    }

    public void addRoom(Room room, ArrayWorker arrayWorker) {


        rooms.addRoom(room, arrayWorker);


    }

    public Room[] returnAllFreeRoom(Integer count) {

        return rooms.returnAllFreeRoom(count);


    }

    public Integer returnAllCountFreeRoom() {

        return rooms.returnAllCountFreeRoom();
    }

    public void returnListWillFree(Date date) {

        rooms.returnListWillFree(date);


    }

    public void changeStar(Integer newStar, Integer num, ArrayWorker arrayWorker) {
        rooms.changeStar(newStar, num, arrayWorker);
    }
}