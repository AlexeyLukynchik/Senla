package com.company.fasad;

import com.company.fasad.Hotel;
import com.company.worker.date.ConvertDate;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        // write your code here
/*
        DefaultDate date = new DefaultDate();

        Room room101 = new Room(120.0,1,2,"free",date.getDefaultDate(),date.getDefaultDate(),101,null);
        Room room102 = new Room(23.2,1,3,"free",date.getDefaultDate(),date.getDefaultDate(),102,null);
        Room room103 = new Room(100.5,1,5,"free",date.getDefaultDate(),date.getDefaultDate(),103,null);

        RepositoryRoom repositoryRoom = new RepositoryRoom(null);

        ArrayWorker arrayWorker = new ArrayWorker();

        ManagerRoom managerRoom = new ManagerRoom();


        managerRoom.addRoom(room101,repositoryRoom,arrayWorker);
        managerRoom.addRoom(room102,repositoryRoom,arrayWorker);
        managerRoom.addRoom(room103,repositoryRoom,arrayWorker);
        repositoryRoom.setRooms(arrayWorker.decrease(repositoryRoom.getRooms()));
        repositoryRoom.setFreeRooms(managerRoom.returnAllFreeRoom(repositoryRoom,managerRoom.returnAllCountFreeRoom(repositoryRoom)));

       System.out.println(repositoryRoom.toString());

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date dateClient1,date1Client2;

        dateClient1 = dateFormat.parse("2017.10.25");
        date1Client2 = dateFormat.parse("2017.10.28");
        Client client = new Client("lukynchik",dateClient1,date1Client2);
        Client client1 = new Client("Smirnow",date.getDefaultDate(),date1Client2);
        Client client2 = new Client("Windsor",dateClient1,date1Client2);

        Service tea = new Service("tea",1.1);
        Service coffee = new Service("coffee",2.3);
        Service transfer = new Service("transfer",59.6);
        RepositoryService repositoryService = new RepositoryService();

        ManagerService managerService = new ManagerService();
        managerService.addService(tea,repositoryService,arrayWorker);
        managerService.addService(coffee,repositoryService,arrayWorker);
        managerService.addService(transfer,repositoryService,arrayWorker);
        System.out.println("SSSEEEERRRVIIICEE");
        System.out.println(repositoryService.toString());

        RepositoryClient repositoryClient = new RepositoryClient();
        ManagerClient managerClient = new ManagerClient();
        managerClient.addClient(client,repositoryClient,arrayWorker);
        managerClient.addClient(client1,repositoryClient,arrayWorker);
        managerClient.addClient(client2,repositoryClient,arrayWorker);

repositoryClient.setClients(arrayWorker.decreaseClients(repositoryClient.getClients()));
        Arrays.sort(repositoryClient.getClients(),new ComparatorBySurname());
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println(repositoryClient.toString());
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

       // managerRoom.occupance(room101,client);
        managerRoom.occupance(client,repositoryRoom,101,arrayWorker);


Date dateService;
        dateService = dateFormat.parse("2017.10.26");


        System.out.println(room101.toString());

        HistoryHotel historyHotel = new HistoryHotel(room101.getNumber());
        HistoryService historyService = new HistoryService(tea,dateService);
        HistoryService historyServiceCoffee = new HistoryService(coffee,dateService);
        RepositoryHistoryHotel repositoryHistoryHotel = new RepositoryHistoryHotel();
        ManagerHistoryHotel managerHistoryHotel = new  ManagerHistoryHotel();
        managerHistoryHotel.addClient(historyHotel,repositoryHistoryHotel,arrayWorker);
        managerService.addHistoryService(historyService,repositoryHistoryHotel.getHistoryHotels()[0],arrayWorker);
        managerService.addHistoryService(historyServiceCoffee,repositoryHistoryHotel.getHistoryHotels()[0],arrayWorker);
        System.out.println(historyHotel.toString());
        repositoryHistoryHotel.getHistoryHotels()[0].setServices(arrayWorker.decreaseHistoryService(repositoryHistoryHotel.getHistoryHotels()[0].getServices()));
        Arrays.sort(historyHotel.getServices(),new ComparatorHistoryServiceByPrice());
        System.out.println("SEEE SUDA");

        System.out.println(historyHotel.toString());
       repositoryRoom.setRooms(arrayWorker.decrease(repositoryRoom.getRooms()));
       repositoryRoom.setFreeRooms(managerRoom.returnAllFreeRoom(repositoryRoom,managerRoom.returnAllCountFreeRoom(repositoryRoom)));

        //managerRoom.eviction(room101,historyHotel);
        managerRoom.eviction(historyHotel,repositoryRoom,101,arrayWorker,repositoryClient);
       // managerRoom.occupance(client,repositoryRoom,101,arrayWorker);
        repositoryRoom.setFreeRooms(managerRoom.returnAllFreeRoom(repositoryRoom,managerRoom.returnAllCountFreeRoom(repositoryRoom)));

        System.out.println(room101.toString());
        System.out.println(historyHotel.toString());

        Arrays.sort(repositoryRoom.getRooms(),new ComparatorByPrice());

        System.out.println(Arrays.toString(repositoryRoom.getRooms()));

        managerClient.returnFinishPrice(client,repositoryRoom);

        managerRoom.changeStar(repositoryRoom,4,101,arrayWorker);

        System.out.println(room101.toString());
  repositoryHistoryHotel.setHistoryHotels(arrayWorker.decreaseHistoryHotel(repositoryHistoryHotel.getHistoryHotels()));
        TextFileWorker textFileWorker = new TextFileWorker("D:/room.txt");
        ParserToString parserToString = new ParserToString();
        TextFileWorker textFileWorker1 = new TextFileWorker("D:/hist.txt");
      //  textFileWorker.writeToFile(parserToString.parseRoom(repositoryRoom,101,arrayWorker));
        textFileWorker1.writeToFile(parserToString.parseHistoryHotel(repositoryHistoryHotel,101,arrayWorker));

        RepositoryRoom repositoryRoom1 = new RepositoryRoom(null);
        ParserToObject parserToObject = new ParserToObject();
        //textFileWorker.readFromFile();

        managerRoom.addRoom(parserToObject.returnRoomObject(textFileWorker.readFromFile()),repositoryRoom1,arrayWorker);

        TextFileWorker textFileWorker2 = new TextFileWorker("D:/client.txt");
        TextFileWorker textFileWorker3 = new TextFileWorker("D:/service.txt");

        textFileWorker2.writeToFile(parserToString.parseClient(repositoryClient,"lukynchik",arrayWorker));
        repositoryService.setServices(arrayWorker.decreaseService(repositoryService.getServices()));
        textFileWorker3.writeToFile(parserToString.parseService(repositoryService,"tea",arrayWorker));
ParserToObject parserToObject1 = new ParserToObject();
       //System.out.println(parserToObject1.returnRoomObject(textFileWorker.readFromFile()).toString());

        System.out.println(parserToObject1.returnHistoryHotel(textFileWorker1.readFromFile()).toString());
        System.out.println(parserToObject1.returnClientObject(textFileWorker2.readFromFile()).toString());
        System.out.println(parserToObject1.returnServiceObject(textFileWorker3.readFromFile()).toString());
        TextFileWorker textFileWorkerRoom101 = new TextFileWorker("D:/labj/task4/src/com/company/room101.txt");
        textFileWorkerRoom101.writeToFile(parserToString.parseRoom(repositoryRoom,101,arrayWorker));
        TextFileWorker textFileWorkerRoom102 = new TextFileWorker("D:/labj/task4/src/com/company/room102.txt");
        textFileWorkerRoom102.writeToFile(parserToString.parseRoom(repositoryRoom,102,arrayWorker));
        managerRoom.addRoom(parserToObject.returnRoomObject(textFileWorkerRoom101.readFromFile()),repositoryRoom,arrayWorker);
        System.out.println(repositoryRoom.getRooms()[repositoryRoom.getRooms().length-1]);
        TextFileWorker textFileWorkerClient1 = new TextFileWorker("D:/labj/task4/src/com/company/client1.txt");
        TextFileWorker textFileWorkerClient2 = new TextFileWorker("D:/labj/task4/src/com/company/client2.txt");
        TextFileWorker textFileWorkerClient3 = new TextFileWorker("D:/labj/task4/src/com/company/client3.txt");
        textFileWorkerClient1.writeToFile(parserToString.parseClient(repositoryClient,"lukynchik",arrayWorker));
        textFileWorkerClient2.writeToFile(parserToString.parseClient(repositoryClient,"Smirnow",arrayWorker));
        textFileWorkerClient3.writeToFile(parserToString.parseClient(repositoryClient,"Windsor",arrayWorker));

        TextFileWorker textFileWorkerTea = new TextFileWorker("D:/labj/task4/src/com/company/tea.txt");
        TextFileWorker textFileWorkerCoffee = new TextFileWorker("D:/labj/task4/src/com/company/coffee.txt");

        textFileWorkerTea.writetoFile(parserToString.parseService(repositoryService,"tea",arrayWorker));
        textFileWorkerCoffee.writeToFile(parserToString.parseService(repositoryService,"coffee",arrayWorker));

        TextFileWorker textFileWorkerHisHot = new TextFileWorker("D:/labj/task4/src/com/company/hist.txt");
        textFileWorkerHisHot.writeToFile(parserToString.parseHistoryHotel(repositoryHistoryHotel,101,arrayWorker));

*/
        String date = "2017.10.27";
        ConvertDate convertDate = new ConvertDate();
        Hotel hotel = new Hotel(convertDate.convertDate(date));
        hotel.workerInHotel(args);

        System.out.println();
    }

}



