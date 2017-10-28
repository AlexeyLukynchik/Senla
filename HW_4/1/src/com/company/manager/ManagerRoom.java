package com.company.manager;

import com.company.worker.ArrayWorker;
import com.company.worker.DefaultDate;
import com.company.worker.Printer;
import com.company.worker.Star;
import com.company.essence.Client;
import com.company.essence.HistoryHotel;
import com.company.essence.Room;
import com.company.repository.RepositoryClient;
import com.company.repository.RepositoryRoom;

import java.text.ParseException;
import java.util.Date;


public class ManagerRoom {

    public RepositoryRoom occupance(Client client,RepositoryRoom repositoryRoom,Integer integer,ArrayWorker arrayWorker) {

        Integer trueNumber;
        trueNumber = arrayWorker.returnNumber(repositoryRoom,integer);

        repositoryRoom.getRooms()[trueNumber].setClient(client.getSurname());
        repositoryRoom.getRooms()[trueNumber].setDateArrival(client.getDateArrival());
         repositoryRoom.getRooms()[trueNumber].setDateEviction(client.getDateEviction());

        client.setNumberRoom(repositoryRoom.getRooms()[trueNumber].getNumber());
        changeStatusBusy(repositoryRoom.getRooms()[trueNumber]);


        return repositoryRoom;


    }

    public RepositoryRoom eviction(HistoryHotel historyHotel,RepositoryRoom repositoryRoom,Integer integer,ArrayWorker arrayWorker, RepositoryClient client) throws ParseException {

        Integer trueNumber;
        trueNumber = arrayWorker.returnNumber(repositoryRoom,integer);
        DefaultDate date = new DefaultDate();

        historyHotel.changeLastClient( repositoryRoom.getRooms()[trueNumber]);
       Integer tN;
        tN = arrayWorker.returnNumClient(client,repositoryRoom.getRooms()[trueNumber].getClient());
        client.getClients()[tN].setNumberRoom(0);
        repositoryRoom.getRooms()[trueNumber].setClient(null);
        repositoryRoom.getRooms()[trueNumber].setDateArrival(date.getDefaultDate());
        repositoryRoom.getRooms()[trueNumber].setDateEviction(date.getDefaultDate());

        changeStatusFree( repositoryRoom.getRooms()[trueNumber]);
        return repositoryRoom;

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

    public void addRoom(Room room, RepositoryRoom repositoryRoom, ArrayWorker arrayWorker) {


        if (arrayWorker.changeLength(repositoryRoom.getRooms()) == true) {
            arrayWorker.addEntity(repositoryRoom.getRooms(), arrayWorker.returnNumberFree(repositoryRoom.getRooms()), room);

        } else {

            arrayWorker.expasionMassiv(repositoryRoom.getRooms());
            repositoryRoom.getRooms()[repositoryRoom.getRooms().length - 1] = room;

        }


    }

    public Room[] returnAllFreeRoom(RepositoryRoom repositoryRoom, Integer count) {

        Room[] freeRooms = new Room[count];
        Integer num = 0;
        // Printer printer = new Printer();
        for (int i = 0; i < repositoryRoom.getRooms().length; i++) {

            if (repositoryRoom.getRooms()[i].getStatus() == "free") {
                // printer.print(repositoryRoom.getRooms()[i].toString());

                freeRooms[num] = repositoryRoom.getRooms()[i];
                num++;

            }

        }
        return freeRooms;

    }

    public Integer returnAllCountFreeRoom(RepositoryRoom repositoryRoom) {

        Integer count = 0;

        Printer printer = new Printer();
        for (int i = 0; i < repositoryRoom.getRooms().length; i++) {

            if (repositoryRoom.getRooms()[i].getStatus().equals("free")) {

                count++;

            }
        }
        printer.print("Count free rooms = " + count.toString());
        return count;
    }

    public void returnListWillFree(RepositoryRoom repositoryRoom, Date date){

        Printer printer = new Printer();
        printer.print("Will free af");
        for (int i = 0;i<repositoryRoom.getRooms().length;i++){

            if (repositoryRoom.getRooms()[i].getDateEviction().after(date)== true){

                printer.print(repositoryRoom.getRooms()[i].getNumber().toString());

            }


        }



    }
  public void changeStar(RepositoryRoom repositoryRoom, Integer newStar,Integer num, ArrayWorker arrayWorker){
Integer trueNumber;
      trueNumber = arrayWorker.returnNumber(repositoryRoom,num);

      switch (newStar)
      {
          case 1:
              repositoryRoom.getRooms()[trueNumber].setCountStars(Star.ONE.getValue());
             break;
          case 2:
              repositoryRoom.getRooms()[trueNumber].setCountStars(Star.TWO.getValue());
              break;
          case 3:
              repositoryRoom.getRooms()[trueNumber].setCountStars(Star.THREE.getValue());
              break;
          case 4:
              repositoryRoom.getRooms()[trueNumber].setCountStars(Star.FOUR.getValue());
              break;
          case 5: repositoryRoom.getRooms()[trueNumber].setCountStars(Star.FIVE.getValue());
              break;
          default:
              System.out.println("Error");
      }



  }
}
