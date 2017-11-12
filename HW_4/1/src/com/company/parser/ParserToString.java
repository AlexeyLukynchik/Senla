package com.company.parser;

import com.company.model.*;
import com.company.manager.ManagerHistoryService;
import com.company.repository.RepositoryClient;
import com.company.repository.RepositoryHistoryHotel;
import com.company.repository.RepositoryRoom;
import com.company.repository.RepositoryService;
import com.company.worker.ArrayWorker;


public class ParserToString {

    public String[] parseRepositoryRoom(RepositoryRoom room, ArrayWorker arrayWorker) {

        Integer count = 0;
        String[] str = new String[room.rooms.length * 8];
        for (int i = 0; i < room.rooms.length; i++) {
            System.arraycopy(parseRoom2(room.rooms[i], arrayWorker), 0, str, count, 8);
            count = count + 8;
        }
        return str;


    }

    public String[] parseRoom2(Room room, ArrayWorker arrayWorker) {
        Integer number;


        String[] obj = new String[8];

        obj[0] = room.getPrice().toString();
        obj[1] = room.getCapacity().toString();
        obj[2] = room.getCountStars().toString();
        obj[3] = room.getStatus();
        obj[4] = room.getDateArrival().toString();
        obj[5] = room.getDateEviction().toString();
        obj[6] = room.getNumber().toString();
        obj[7] = room.getID().toString();

        return obj;

    }


    public String[] parseRepoClient(RepositoryClient client, ArrayWorker arrayWorker) {
        Integer count = 0;
        String[] str = new String[client.clients.length * 4];
        for (int i = 0; i < client.clients.length; i++) {
            System.arraycopy(parseClient2(client.clients[i]), 0, str, count, 4);
            count = count + 4;
        }
        return str;


    }

    public String[] parseClient2(Client client) {


        String[] obj = new String[4];
        obj[0] = String.valueOf(client.getID());
        obj[1] = client.getSurname();
        obj[2] = client.getDateArrival().toString();
        obj[3] = client.getDateEviction().toString();

        return obj;


    }

    public String[] parseRepoService(RepositoryService service, ArrayWorker arrayWorker) {
        Integer count = 0;
        String[] str = new String[service.services.length * 2];
        for (int i = 0; i < service.services.length; i++) {
            System.arraycopy(parseService2(service.services[i]), 0, str, count, 2);
            count = count + 2;
        }
        return str;
    }

    public String[] parseService2(Service service) {

        String[] obj = new String[2];

        obj[0] = service.getName();
        obj[1] = service.getPrice().toString();


        return obj;
    }

    /*
        public String[] parseService(RepositoryService repositoryService, String name, ArrayWorker arrayWorker){
        Integer number;
        number = arrayWorker.returnNumService(repositoryService,name);

        String[] obj = new String[2];

        obj[0] = repositoryService.getServices()[number].getName();
        obj[1] = repositoryService.getServices()[number].getPrice().toString();


        return obj;
    }
    */
    public String[] parseRepositoryHistory(RepositoryHistoryHotel historyHotel, ManagerHistoryService service) {

        Integer count = 0;
        String[] str = new String[historyHotel.hotels.length * 4];
        for (int i = 0; i < historyHotel.hotels.length; i++) {
            System.arraycopy(parseHistoryHotel2(historyHotel.hotels[i], service, historyHotel), 0, str, count, 4);
            count = count + 8;
        }
        return str;


    }

    public String[] parseHistoryHotel2(HistoryHotel hotel, ManagerHistoryService service, RepositoryHistoryHotel historyHotel) {


        String[] obj = new String[4];

        obj[0] = String.valueOf(hotel.getNumberRoom());
        obj[1] = parseLast(hotel.getLastThree());
        obj[2] = parseService(hotel.getServices(), service.returnCountHistory());
        obj[3] = parseDateService(hotel.getServices(), service.returnCountHistory());

        return obj;
    }


    public String parseLast(String[] str) {

        String str1 = str[0] + " " + str[1] + " " + str[2];

        return str1;

    }

    public String parseService(HistoryService[] services, Integer num) {

        String answer = services[0].getService().toString();
        for (int i = 1; i < num; i++) {

            answer = answer + "/" + services[i].getService().toString();

        }
        return answer;
    }

    public String parseDateService(HistoryService[] services, Integer num) {
        String answer = services[0].getDate().toString();
        for (int i = 0; i < num; i++) {

            answer = answer + "/" + services[i].getDate().toString();

        }
        return answer;


    }
}
