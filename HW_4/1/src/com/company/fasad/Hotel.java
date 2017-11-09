package com.company.fasad;

import com.company.allcomparator.comparatorhistoryservice.ComparatorHistoryServiceByPrice;
import com.company.allcomparator.comparatorroom.ComparatorByCapacity;
import com.company.essence.HistoryHotel;
import com.company.essence.HistoryService;
import com.company.manager.*;
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
import java.util.Date;


public class Hotel {
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Hotel(Date date) {
        this.date = date;
    }

    public void workerInHotel(String[] arg) throws ParseException {





      /*





        TextFileWorker textFileWorkerHisHot = new TextFileWorker("D:/labj/task4/src/com/company/hist.txt");
        ManagerHistoryHotel managerHistoryHotel = new ManagerHistoryHotel();
        managerHistoryHotel.addClient(parserToObject.returnHistoryHotel(textFileWorkerHisHot.readFromFile()),repositoryHistoryHotel,arrayWorker);
*/
///////////////////
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        ParserToString parserToString = new ParserToString();
        ParserToObject parserToObject = new ParserToObject();
        TextFileWorker repoRoom = new TextFileWorker("D:/labj/task4/src/com/company/reposRoom.txt");
        TextFileWorker repoClient = new TextFileWorker("D:/labj/task4/src/com/company/reposClient.txt");
        TextFileWorker repoService = new TextFileWorker("D:/labj/task4/src/com/company/reposService.txt");
        TextFileWorker repoHistory = new TextFileWorker("D:/labj/task4/src/com/company/reposHistory.txt");
        RepositoryRoom room = parserToObject.returnRepoRoom(repoRoom.readFromFile());
        RepositoryClient reposClientclient = parserToObject.returnReposClient(repoClient.readFromFile());
        RepositoryService service = parserToObject.returnReposService(repoService.readFromFile());
        RepositoryHistoryHotel rHistoryHotel = new RepositoryHistoryHotel();
        rHistoryHotel = parserToObject.returnRepoHistory(repoHistory.readFromFile());
        Date dateService;
        dateService = dateFormat.parse("2017.10.26");
        HistoryHotel historyHotel = new HistoryHotel(room.getRooms()[0].getNumber());
        HistoryService historyService = new HistoryService(service.getServices()[0], dateService);
        ManagerHistoryHotel managerHistoryHotel = new ManagerHistoryHotel(rHistoryHotel);
        ArrayWorker arrayWorker = new ArrayWorker();

        ManagerRoom managerRoom = new ManagerRoom(room,reposClientclient);

        ManagerService managerService = new ManagerService(service);
        //TextFileWorker repoRoom = new TextFileWorker(arg[0]);
        ManagerHistoryService managerHistoryService = new ManagerHistoryService(rHistoryHotel);

        //  repoRoom.writeToFile(parserToString.parseRepositoryRoom(repositoryRoom,arrayWorker));
       // RepositoryRoom room = parserToObject.returnRepoRoom(repoRoom.readFromFile());

        //TextFileWorker repoClient = new TextFileWorker(arg[1]);
        //repoClient.writeToFile(parserToString.parseRepoClient(repositoryC,arrayWorker));


        //TextFileWorker repoService = new TextFileWorker(arg[2]);

//repoService.writeToFile(parserToString.parseRepoService(repositoryService,arrayWorker));




        //      repositoryHistoryHotel.setHistoryHotels(arrayWorker.decreaseHistoryHotel(repositoryHistoryHotel.getHistoryHotels()));
        //    repoHistory.writeToFile(parserToString.parseRepositoryHistory(repositoryHistoryHotel));

        //  RepositoryHistoryHotel repositoryHistoryHotel = new RepositoryHistoryHotel();
        managerRoom.occupance(reposClientclient.getClients()[0],  room.getRooms()[0].getNumber(), arrayWorker, historyHotel);
        //ManagerHistoryHotel managerHistoryHotel1 = new  ManagerHistoryHotel();
        managerHistoryHotel.addClient(historyHotel,  arrayWorker);
        managerHistoryService.addHistoryService(historyService, rHistoryHotel.getHistoryHotels()[0], arrayWorker);
        // rHistoryHotel.setHistoryHotels(arrayWorker.decreaseHistoryHotel(rHistoryHotel.getHistoryHotels()));
        // rHistoryHotel.getHistoryHotels()[0].setServices(arrayWorker.decreaseHistoryService(rHistoryHotel.getHistoryHotels()[0].getServices()));

        repoHistory.writeToFile(parserToString.parseRepositoryHistory(rHistoryHotel, managerHistoryService));
        room.setFreeRooms(managerRoom.returnAllFreeRoom(managerRoom.returnAllCountFreeRoom()));
       /* Arrays.sort(room.getRooms(), new ComparatorByPrice());
        //service.setServices(arrayWorker.decreaseService(service.getServices()));
        Arrays.sort(service.getServices(), new ComparatorByServicePrice());
        Arrays.sort(reposClientclient.getClients(), new ComparatorByDate());
        Arrays.sort(rHistoryHotel.getHistoryHotels()[0].getServices(), new ComparatorHistoryServiceByPrice());*/
        managerRoom.sortRoom( new ComparatorByCapacity());
        managerHistoryService.sortHistoryService(rHistoryHotel, new ComparatorHistoryServiceByPrice(), 101);

        ManagerClient managerClient = new ManagerClient(reposClientclient,room);
        managerClient.returnFinishPrice(reposClientclient.getClients()[0]);
        managerRoom.returnListWillFree( date);


    }

}
