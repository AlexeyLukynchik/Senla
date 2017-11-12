package com.company.fasad;

import com.company.allcomparator.comparatorhistoryservice.ComparatorHistoryServiceByPrice;
import com.company.allcomparator.comparatorroom.ComparatorByCapacity;
import com.company.manager.*;
import com.company.model.*;

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


        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        ParserToString parserToString = new ParserToString();
        ParserToObject parserToObject = new ParserToObject();
        TextFileWorker repoRoom = new TextFileWorker("D:/labj/Hotel/src/com/company/txt/reposRoom.txt");
        TextFileWorker repoClient = new TextFileWorker("D:/labj/Hotel/src/com/company/txt/reposClient.txt");
        TextFileWorker repoService = new TextFileWorker("D:/labj/Hotel/src/com/company/txt/reposService.txt");
        TextFileWorker repoHistory = new TextFileWorker("D:/labj/Hotel/src/com/company/txt/reposHistory.txt");
        RepositoryRoom room = parserToObject.returnRepoRoom(repoRoom.readFromFile());
        RepositoryClient reposClientclient = parserToObject.returnReposClient(repoClient.readFromFile());
        RepositoryService service = parserToObject.returnReposService(repoService.readFromFile());
        RepositoryHistoryHotel rHistoryHotel = new RepositoryHistoryHotel();
        rHistoryHotel = parserToObject.returnRepoHistory(repoHistory.readFromFile());
        Date dateService;
        dateService = dateFormat.parse("2017.10.26");
        HistoryHotel historyHotel = new HistoryHotel(room.rooms[0].getNumber());
        HistoryService historyService = new HistoryService(service.services[0], dateService);
        ManagerHistoryHotel managerHistoryHotel = new ManagerHistoryHotel(rHistoryHotel);
        ArrayWorker arrayWorker = new ArrayWorker();

        ManagerRoom managerRoom = new ManagerRoom(room, reposClientclient);

        ManagerService managerService = new ManagerService(service);

        ManagerHistoryService managerHistoryService = new ManagerHistoryService(rHistoryHotel);


        managerRoom.occupance(reposClientclient.clients[0], room.rooms[0].getNumber(), arrayWorker, historyHotel);

        managerHistoryHotel.addClient(historyHotel, arrayWorker);
        managerHistoryService.addHistoryService(historyService, rHistoryHotel.hotels[0], arrayWorker);

        repoHistory.writeToFile(parserToString.parseRepositoryHistory(rHistoryHotel, managerHistoryService));
        room.freeRooms = managerRoom.returnAllFreeRoom(managerRoom.returnAllCountFreeRoom());

        managerRoom.sortRoom(new ComparatorByCapacity());
        managerHistoryService.sortHistoryService(new ComparatorHistoryServiceByPrice(), 101);
        RepositoryClient repositoryClient = new RepositoryClient(reposClientclient.clients, room.rooms);

        ManagerClient managerClient = new ManagerClient(room, repositoryClient);
        managerClient.returnFinishPrice(reposClientclient.clients[0]);
        managerRoom.returnListWillFree(date);


    }

}
