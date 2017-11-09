package com.company.manager;

import com.company.worker.ArrayWorker;
import com.company.worker.date.DefaultDate;
import com.company.worker.Printer;
import com.company.worker.Star;
import com.company.essence.Client;
import com.company.essence.HistoryHotel;
import com.company.essence.Room;
import com.company.repository.RepositoryClient;
import com.company.repository.RepositoryRoom;

import java.text.ParseException;
import java.util.Arrays;
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

    public Room occupance(Client client,  Integer integer, ArrayWorker arrayWorker, HistoryHotel historyHotel) {

         Integer num = arrayWorker.returnNumber(getRooms(),integer);

        historyHotel.changeLastClient(getRooms().getRooms()[num],client);
       getRooms().getRooms()[num].setID(client.getID());
        getRooms().getRooms()[num].setDateArrival(client.getDateArrival());
        getRooms().getRooms()[num].setDateEviction(client.getDateEviction());

        //client.setID(room.getNumber());
        changeStatus(getRooms().getRooms()[num], "busy");
        //changeStatusBusy(repositoryRoom.getRooms()[trueNumber]);


        return getRooms().getRooms()[num];


    }

    public Room eviction(HistoryHotel historyHotel, Integer integer, ArrayWorker arrayWorker) throws ParseException {

        Integer num = arrayWorker.returnNumber(getRooms(),integer);
        DefaultDate date = new DefaultDate();

        //historyHotel.changeLastClient(repositoryRoom.getRooms()[trueNumber]);
        Integer tN;


        getRooms().getRooms()[num].setID(-1);
        getRooms().getRooms()[num].setDateArrival(date.getDefaultDate());
        getRooms().getRooms()[num].setDateEviction(date.getDefaultDate());

        changeStatusFree(getRooms().getRooms()[num]);
        return getRooms().getRooms()[num];

    }

    public Room[] sortRoom( Comparator comparator) {
        Room[] rooms = getRooms().getRooms();
        Arrays.sort(rooms, comparator);
        return rooms;
    }

    public Room changeStatus(Room room, String status) {
        Printer printer = new Printer();

        switch (status) {
            case "free":
                changeStatusFree(room);
                break;
            case "busy":
                changeStatusBusy(room);
                break;
            case "repairs":
                changeStatusRepairs(room);
                break;
            case "cleaning":
                changeStatusCleaning(room);
                break;
            default:
                printer.print("Error");
        }

        return room;

    }

    public Room changeStatusFree(Room room) {

        room.setStatus("free");
        return room;
    }

    public Room changeStatusBusy(Room room) {
        room.setStatus("busy");
        return room;

    }

    public Room changeStatusRepairs(Room room) {
        room.setStatus("repairs");
        return room;

    }

    public Room changeStatusCleaning(Room room) {
        room.setStatus("cleaning");

        return room;

    }

    public Room changePrice(Room room, Double newPrice) {

        room.setPrice(newPrice);
        return room;
    }

    public void addRoom(Room room,  ArrayWorker arrayWorker) {


        if (arrayWorker.changeLength(getRooms().getRooms()) == true) {
            arrayWorker.addEntity(getRooms().getRooms(), arrayWorker.returnNumberFree(getRooms().getRooms()), room);

        } else {

            arrayWorker.expasionMassiv(getRooms().getRooms());
            getRooms().getRooms()[getRooms().getRooms().length - 1] = room;

        }


    }

    public Room[] returnAllFreeRoom( Integer count) {

        Room[] freeRooms = new Room[returnAllCountFreeRoom()];
        Integer num = 0;
        // Printer printer = new Printer();
        for (int i = 0; i < getRooms().getRooms().length; i++) {

            if (getRooms().getRooms()[i].getStatus() == "free") {
                // printer.print(repositoryRoom.getRooms()[i].toString());

                freeRooms[num] = getRooms().getRooms()[i];
                num++;

            }

        }
        return freeRooms;

    }

    public Integer returnAllCountFreeRoom() {

        Integer count = 0;

        Printer printer = new Printer();
        for (int i = 0; i < getRooms().getRooms().length; i++) {

            if (getRooms().getRooms()[i].getStatus().equals("free")) {

                count++;

            }
        }
        printer.print("Count free rooms = " + count.toString());
        return count;
    }

    public void returnListWillFree( Date date) {

        Printer printer = new Printer();
        printer.print("Will free");
        for (int i = 0; i < getRooms().getRooms().length; i++) {

            if (date.before(getRooms().getRooms()[i].getDateEviction()) == true) {

                printer.print(getRooms().getRooms()[i].getNumber().toString());

            }


        }


    }

    public void changeStar(RepositoryRoom repositoryRoom, Integer newStar, Integer num, ArrayWorker arrayWorker) {
        Integer trueNumber;
        trueNumber = arrayWorker.returnNumber(repositoryRoom, num);

        switch (newStar) {
            case 1:
                getRooms().getRooms()[trueNumber].setCountStars(Star.ONE.getValue());
                break;
            case 2:
                getRooms().getRooms()[trueNumber].setCountStars(Star.TWO.getValue());
                break;
            case 3:
                getRooms().getRooms()[trueNumber].setCountStars(Star.THREE.getValue());
                break;
            case 4:
                getRooms().getRooms()[trueNumber].setCountStars(Star.FOUR.getValue());
                break;
            case 5:
                getRooms().getRooms()[trueNumber].setCountStars(Star.FIVE.getValue());
                break;
            default:
                System.out.println("Error");
        }


    }
}
