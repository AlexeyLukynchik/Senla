package com.company;

import com.company.allComparator.comparatorClient.ComparatorByDate;
import com.company.allComparator.comparatorHistoryService.ComparatorHistoryServiceByPrice;
import com.company.allComparator.comparatorRoom.ComparatorByPrice;
import com.company.allComparator.comparatorService.ComparatorByServicePrice;
import com.company.essence.HistoryHotel;
import com.company.essence.HistoryService;
import com.company.manager.ManagerClient;
import com.company.manager.ManagerHistoryHotel;
import com.company.manager.ManagerRoom;
import com.company.manager.ManagerService;
import com.company.parser.ParserToObject;
import com.company.parser.ParserToString;
import com.company.repository.RepositoryClient;
import com.company.repository.RepositoryHistoryHotel;
import com.company.repository.RepositoryRoom;
import com.company.repository.RepositoryService;
import com.company.worker.ArrayWorker;
import com.danco.training.TextFileWorker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by Алексей on 27.10.2017.
 */
public class Hotel {
    public void workerInHotel(String [] arg) throws ParseException {

      /*
        RepositoryRoom repositoryRoom = new RepositoryRoom(null);

        RepositoryClient repositoryClient = new RepositoryClient();
        RepositoryService repositoryService = new RepositoryService();
        RepositoryHistoryHotel repositoryHistoryHotel = new RepositoryHistoryHotel();
        TextFileWorker textFileWorkerRoom101 = new TextFileWorker("D:/labj/task4/src/com/company/room101.txt");
       // textFileWorkerRoom101.writeToFile(parserToString.parseRoom(repositoryRoom,101,arrayWorker));
        TextFileWorker textFileWorkerRoom102 = new TextFileWorker("D:/labj/task4/src/com/company/room102.txt");
       // textFileWorkerRoom102.writeToFile(parserToString.parseRoom(repositoryRoom,102,arrayWorker));
        managerRoom.addRoom(parserToObject.returnRoomObject(textFileWorkerRoom101.readFromFile()),repositoryRoom,arrayWorker);
        managerRoom.addRoom(parserToObject.returnRoomObject(textFileWorkerRoom102.readFromFile()),repositoryRoom,arrayWorker);
        repositoryRoom.setRooms(arrayWorker.decrease(repositoryRoom.getRooms()));
        repositoryRoom.setFreeRooms(managerRoom.returnAllFreeRoom(repositoryRoom,managerRoom.returnAllCountFreeRoom(repositoryRoom)));
*//*
        System.out.println(repositoryRoom.getRooms()[repositoryRoom.getRooms().length-1]);
        TextFileWorker textFileWorkerClient1 = new TextFileWorker("D:/labj/task4/src/com/company/client1.txt");
        TextFileWorker textFileWorkerClient2 = new TextFileWorker("D:/labj/task4/src/com/company/client2.txt");
        TextFileWorker textFileWorkerClient3 = new TextFileWorker("D:/labj/task4/src/com/company/client3.txt");*/
       /* textFileWorkerClient1.writeToFile(parserToString.parseClient(repositoryClient,"lukynchik",arrayWorker));
        textFileWorkerClient2.writeToFile(parserToString.parseClient(repositoryClient,"Smirnow",arrayWorker));
        textFileWorkerClient3.writeToFile(parserToString.parseClient(repositoryClient,"Windsor",arrayWorker));*/

       /* TextFileWorker textFileWorkerTea = new TextFileWorker("D:/labj/task4/src/com/company/tea.txt");
        TextFileWorker textFileWorkerCoffee = new TextFileWorker("D:/labj/task4/src/com/company/coffee.txt");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date dateClient1,date1Client2;

        dateClient1 = dateFormat.parse("2017.10.25");
        date1Client2 = dateFormat.parse("2017.10.28");
        Client client = new Client("lukynchik",dateClient1,date1Client2);
        Client client1 = new Client("Smirnow",date1Client2,date1Client2);
        Client client2 = new Client("Windsor",dateClient1,date1Client2);
RepositoryClient repositoryC = new RepositoryClient();
        ManagerClient managerClient = new ManagerClient();
        managerClient.addClient(client,repositoryC,arrayWorker);
        managerClient.addClient(client1,repositoryC,arrayWorker);
        managerClient.addClient(client2,repositoryC,arrayWorker);
        repositoryC.setClients(arrayWorker.decreaseClients(repositoryC.getClients()));
        ManagerService managerService = new ManagerService();

        managerService.addService(parserToObject.returnServiceObject(textFileWorkerTea.readFromFile()),repositoryService,arrayWorker);
        repositoryService.setServices(arrayWorker.decreaseService(repositoryService.getServices()));
       // textFileWorkerTea.writeToFile(parserToString.parseService(repositoryService,"tea",arrayWorker));
        //textFileWorkerCoffee.writeToFile(parserToString.parseService(repositoryService,"coffee",arrayWorker));



        TextFileWorker textFileWorkerHisHot = new TextFileWorker("D:/labj/task4/src/com/company/hist.txt");
        ManagerHistoryHotel managerHistoryHotel = new ManagerHistoryHotel();
        managerHistoryHotel.addClient(parserToObject.returnHistoryHotel(textFileWorkerHisHot.readFromFile()),repositoryHistoryHotel,arrayWorker);
*/
///////////////////
        ManagerHistoryHotel managerHistoryHotel = new ManagerHistoryHotel();
        ArrayWorker arrayWorker = new ArrayWorker();
        ParserToString parserToString = new ParserToString();
        ParserToObject parserToObject = new ParserToObject();
        ManagerRoom managerRoom = new ManagerRoom();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        ManagerService managerService = new ManagerService();
        TextFileWorker repoRoom = new TextFileWorker(arg[0]);

      //  repoRoom.writeToFile(parserToString.parseRepositoryRoom(repositoryRoom,arrayWorker));
        RepositoryRoom room = parserToObject.returnRepoRoom(repoRoom.readFromFile());

     TextFileWorker repoClient = new TextFileWorker(arg[1]);
        //repoClient.writeToFile(parserToString.parseRepoClient(repositoryC,arrayWorker));
        RepositoryClient reposClientclient = parserToObject.returnReposClient(repoClient.readFromFile());

TextFileWorker repoService = new TextFileWorker(arg[2]);

//repoService.writeToFile(parserToString.parseRepoService(repositoryService,arrayWorker));
        RepositoryService service = parserToObject.returnReposService(repoService.readFromFile());


         TextFileWorker repoHistory = new TextFileWorker(arg[3]);
  //      repositoryHistoryHotel.setHistoryHotels(arrayWorker.decreaseHistoryHotel(repositoryHistoryHotel.getHistoryHotels()));
    //    repoHistory.writeToFile(parserToString.parseRepositoryHistory(repositoryHistoryHotel));
        RepositoryHistoryHotel rHistoryHotel = new RepositoryHistoryHotel();
        rHistoryHotel = parserToObject.returnRepoHistory(repoHistory.readFromFile());
        Date dateService;
        dateService = dateFormat.parse("2017.10.26");
        HistoryHotel historyHotel = new HistoryHotel(room.getRooms()[0].getNumber());
        HistoryService historyService = new HistoryService(service.getServices()[0],dateService);
      //  RepositoryHistoryHotel repositoryHistoryHotel = new RepositoryHistoryHotel();
        managerRoom.occupance(reposClientclient.getClients()[0],room,room.getRooms()[0].getNumber(),arrayWorker);
        //ManagerHistoryHotel managerHistoryHotel1 = new  ManagerHistoryHotel();
        managerHistoryHotel.addClient(historyHotel,rHistoryHotel,arrayWorker);
        managerService.addHistoryService(historyService,rHistoryHotel.getHistoryHotels()[0],arrayWorker);
        rHistoryHotel.setHistoryHotels(arrayWorker.decreaseHistoryHotel(rHistoryHotel.getHistoryHotels()));
        rHistoryHotel.getHistoryHotels()[0].setServices(arrayWorker.decreaseHistoryService(rHistoryHotel.getHistoryHotels()[0].getServices()));
        repoHistory.writeToFile(parserToString.parseRepositoryHistory(rHistoryHotel));
         room.setFreeRooms(managerRoom.returnAllFreeRoom(room,managerRoom.returnAllCountFreeRoom(room)));
        Arrays.sort(room.getRooms(),new ComparatorByPrice());
        service.setServices(arrayWorker.decreaseService(service.getServices()));
        Arrays.sort(service.getServices(),new ComparatorByServicePrice());
        Arrays.sort(reposClientclient.getClients(),new ComparatorByDate());
        Arrays.sort(rHistoryHotel.getHistoryHotels()[0].getServices(),new ComparatorHistoryServiceByPrice());
        ManagerClient managerClient = new ManagerClient();
        managerClient.returnFinishPrice(reposClientclient.getClients()[0],room);

    }

}
