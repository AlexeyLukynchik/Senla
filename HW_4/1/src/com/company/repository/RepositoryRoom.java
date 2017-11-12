package com.company.repository;

import com.company.worker.ArrayWorker;
import com.company.worker.Printer;
import com.company.worker.Star;
import com.company.date.DefaultDate;
import com.company.model.Client;
import com.company.model.HistoryHotel;
import com.company.model.Room;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by Алексей on 09.11.2017.
 */
public class RepositoryRoom {
    public static Printer printer = new Printer();
    public Room[] rooms;

    public Room[] freeRooms;

    public RepositoryRoom() {
    }

    public RepositoryRoom(Room[] rooms, Room[] freeRooms) {
        this.rooms = rooms;
        this.freeRooms = freeRooms;
    }

    public Room occupance(Client client, Integer integer, ArrayWorker arrayWorker, HistoryHotel historyHotel) {

        Integer num = arrayWorker.returnNumber(rooms, integer);

        historyHotel.changeLastClient(rooms[num], client);
        rooms[num].setID(client.getID());
        rooms[num].setDateArrival(client.getDateArrival());
        rooms[num].setDateEviction(client.getDateEviction());

        //client.setID(room.getNumber());
        changeStatus(rooms[num], "busy");
        //changeStatusBusy(repositoryRoom.getRooms()[trueNumber]);


        return rooms[num];


    }

    public Room eviction(HistoryHotel historyHotel, Integer integer, ArrayWorker arrayWorker) throws ParseException {

        Integer num = arrayWorker.returnNumber(rooms, integer);
        DefaultDate date = new DefaultDate();

        //historyHotel.changeLastClient(repositoryRoom.getRooms()[trueNumber]);
        Integer tN;


        rooms[num].setID(-1);
        rooms[num].setDateArrival(date.getDefaultDate());
        rooms[num].setDateEviction(date.getDefaultDate());

        changeStatusFree(rooms[num]);
        return rooms[num];

    }

    public Room[] sortRoom(Comparator comparator) {
        Room[] rooms1 = rooms;
        Arrays.sort(rooms1, comparator);
        return rooms1;
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

    public void addRoom(Room room, ArrayWorker arrayWorker) {


        if (arrayWorker.changeLength(rooms) == true) {
            arrayWorker.addEntity(rooms, arrayWorker.returnNumberFree(rooms), room);

        } else {

            arrayWorker.expasionMassiv(rooms);
            rooms[rooms.length - 1] = room;

        }


    }

    public Room[] returnAllFreeRoom(Integer count) {

        Room[] freeRooms = new Room[returnAllCountFreeRoom()];
        Integer num = 0;

        for (int i = 0; i < rooms.length; i++) {

            if (rooms[i].getStatus() == "free") {


                freeRooms[num] = rooms[i];
                num++;

            }

        }
        return freeRooms;

    }

    public Integer returnAllCountFreeRoom() {

        Integer count = 0;


        for (int i = 0; i < rooms.length; i++) {

            if (rooms[i].getStatus().equals("free")) {

                count++;

            }
        }
        printer.print("Count free rooms = " + count.toString());
        return count;
    }

    public void returnListWillFree(Date date) {


        printer.print("Will free");
        for (int i = 0; i < rooms.length; i++) {

            if (date.before(rooms[i].getDateEviction()) == true) {

                printer.print(rooms[i].getNumber().toString());

            }


        }


    }

    public void changeStar(Integer newStar, Integer num, ArrayWorker arrayWorker) {
        Integer trueNumber;
        trueNumber = arrayWorker.returnNumber(rooms, num);

        switch (newStar) {
            case 1:
                rooms[trueNumber].setCountStars(Star.ONE.getValue());
                break;
            case 2:
                rooms[trueNumber].setCountStars(Star.TWO.getValue());
                break;
            case 3:
                rooms[trueNumber].setCountStars(Star.THREE.getValue());
                break;
            case 4:
                rooms[trueNumber].setCountStars(Star.FOUR.getValue());
                break;
            case 5:
                rooms[trueNumber].setCountStars(Star.FIVE.getValue());
                break;
            default:
                System.out.println("Error");
        }


    }


    @Override
    public String toString() {
        return "RepositoryRoom{" +
                "rooms=" + Arrays.toString(rooms) +
                ", freeRooms=" + Arrays.toString(freeRooms) +
                '}';
    }
}
