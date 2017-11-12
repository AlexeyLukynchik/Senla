package com.company.parser;

import com.company.model.*;

import com.company.repository.RepositoryClient;
import com.company.repository.RepositoryHistoryHotel;
import com.company.repository.RepositoryRoom;
import com.company.repository.RepositoryService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ParserToObject {

    public RepositoryRoom returnRepoRoom(String[] str) throws ParseException {

        RepositoryRoom room = new RepositoryRoom();

        Integer count = 0;
        Integer num = str.length / 8;
        String[] prom = new String[8];
        Room[] rooms = new Room[str.length / 8];
        Integer i = 0;
        while (count < str.length) {
            System.arraycopy(str, count, prom, 0, 8);
            rooms[i] = returnRoomObject(prom);
            i++;
            count += 8;
        }
        room.rooms = rooms;

        return room;
    }

    public RepositoryClient returnReposClient(String[] str) throws ParseException {
        RepositoryClient client = new RepositoryClient();

        Integer count = 0;
        String[] prom = new String[4];
        Client[] clients = new Client[str.length / 4];
        int i = 0;
        while (count < str.length) {
            System.arraycopy(str, count, prom, 0, 4);
            clients[i] = returnClientObject(prom);
            i++;
            count += 4;
        }
        client.clients = clients;
        return client;
    }

    public RepositoryService returnReposService(String[] str) throws ParseException {
        RepositoryService service = new RepositoryService();

        Integer count = 0;
        String[] prom = new String[2];
        Service[] services = new Service[str.length * 2];
        int i = 0;
        while (count < str.length) {
            System.arraycopy(str, count, prom, 0, 2);
            services[i] = returnServiceObject(prom);
            i++;
            count += 2;
        }
        service.services = services;
        return service;
    }

    public RepositoryHistoryHotel returnRepoHistory(String[] str) throws ParseException {

        RepositoryHistoryHotel historyHotel = new RepositoryHistoryHotel();

        Integer count = 0;

        String[] prom = new String[4];
        HistoryHotel[] hotels = new HistoryHotel[str.length / 4];
        Integer i = 0;
        while (count < str.length) {
            System.arraycopy(str, count, prom, 0, 4);
            hotels[i] = returnHistoryHotel(prom);
            i++;
            count += 4;
        }
        historyHotel.hotels = hotels;

        return historyHotel;
    }

    public Room returnRoomObject(String[] str) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date dateA;
        Date dateE;

        Double price = Double.parseDouble(str[0]);
        Integer capacity = Integer.parseInt(str[1]);
        Integer countStars = Integer.parseInt(str[2]);
        String status = str[3];
        dateA = dateFormat.parse(parseDate(str[4]));
        dateE = dateFormat.parse(parseDate(str[5]));
        Integer num = Integer.parseInt(str[6]);
        Integer ID = Integer.parseInt(str[7]);

        Room room = new Room(price, capacity, countStars, status, dateA, dateE, num, ID);
        return room;


    }

    public Client returnClientObject(String[] str) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date dateA;
        Date dateE;


        String sur = str[1];
        dateA = dateFormat.parse(parseDate(str[2]));
        dateE = dateFormat.parse(parseDate(str[3]));

        Client client = new Client(ID.getID(), sur, dateA, dateE);
        ID.setID(ID.getID() + 1);
        client.setID(Integer.parseInt(str[0]));

        return client;
    }

    public Service returnServiceObject(String[] str) {

        Service service = new Service(str[0], Double.parseDouble(str[1]));
        return service;

    }

    public HistoryHotel returnHistoryHotel(String[] str) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");

        Integer num = Integer.parseInt(str[0]);
        String[] split = str[1].split(" ");
        String[] strings = str[2].split("/");

        Service[] service = new Service[strings.length];
        service = returnService(strings);
        strings = str[3].split("/");

        Date[] dates = new Date[strings.length];

        for (int i = 0; i < strings.length; i++) {

            dates[i] = dateFormat.parse(parseDate(strings[i]));


        }
        HistoryService[] historyServices = new HistoryService[service.length];

        for (int i = 0; i < service.length; i++) {

            historyServices[i] = new HistoryService(service[i], dates[i]);

        }

        HistoryHotel historyHotel = new HistoryHotel(num, split, historyServices);
        return historyHotel;
    }

    public Service[] returnService(String[] str) {
        Service[] services = new Service[str.length];
        String[] prom = new String[2];
        for (int i = 0; i < str.length; i++) {
            prom = str[0].split(" ");
            Service service = new Service(prom[0], Double.parseDouble(prom[1]));
            services[i] = service;


        }
        return services;
    }

    public String parseDate(String str) {

        String[] split = str.split(" ");

        Integer month = 0;

        switch (split[1]) {
            case "Dec":
                month = 12;
                break;

            case "Jan":
                month = 01;
                break;

            case "Feb":
                month = 02;
                break;

            case "Mar":
                month = 03;
                break;

            case "Apr":
                month = 04;
                break;

            case "May":
                month = 05;
                break;

            case "June":
                month = 06;
                break;

            case "July":
                month = 07;
                break;

            case "Aug":
                month = 8;
                break;

            case "Sept":
                month = 9;
                break;

            case "Oct":
                month = 10;
                break;

            case "Nov":
                month = 11;
                break;
            default:
                break;


        }
        String date = split[5] + "." + month.toString() + "." + split[2];
        return date;

    }
}
