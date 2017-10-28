package com.company.parser;

import com.company.essence.*;
import com.company.worker.ArrayWorker;
import com.company.repository.RepositoryClient;
import com.company.repository.RepositoryHistoryHotel;
import com.company.repository.RepositoryRoom;
import com.company.repository.RepositoryService;
import com.sun.deploy.util.ArrayUtil;

/**
 * Created by Алексей on 26.10.2017.
 */
public class ParserToString {

    public String[] parseRepositoryRoom(RepositoryRoom room, ArrayWorker arrayWorker){

   Integer count = 0;
        String[] str = new String[room.getRooms().length*8];
        for (int i = 0; i<room.getRooms().length;i++){
            System.arraycopy(parseRoom2(room.getRooms()[i],arrayWorker),0,str,count,8);
count = count+8;
        }
return str;


    }
    public String[] parseRoom2(Room room, ArrayWorker arrayWorker){
        Integer number;

        //number = arrayWorker.returnNumber(repositoryRoom,num);

        String[] obj = new String[8];

        obj[0] = room.getPrice().toString();
        obj[1] = room.getCapacity().toString();
        obj[2] = room.getCountStars().toString();
        obj[3] = room.getStatus();
        obj[4] = room.getDateArrival().toString();
        obj[5] = room.getDateEviction().toString();
        obj[6] = room.getNumber().toString();
        obj[7] = room.getClient();

        return obj;

    }

    /*public String[] parseRoom(RepositoryRoom repositoryRoom, Integer num,ArrayWorker arrayWorker){
        Integer number;

        number = arrayWorker.returnNumber(repositoryRoom,num);

        String[] obj = new String[8];

        obj[0] = repositoryRoom.getRooms()[number].getPrice().toString();
        obj[1] = repositoryRoom.getRooms()[number].getCapacity().toString();
        obj[2] = repositoryRoom.getRooms()[number].getCountStars().toString();
        obj[3] = repositoryRoom.getRooms()[number].getStatus();
        obj[4] = repositoryRoom.getRooms()[number].getDateArrival().toString();
        obj[5] = repositoryRoom.getRooms()[number].getDateEviction().toString();
        obj[6] = repositoryRoom.getRooms()[number].getNumber().toString();
        obj[7] = repositoryRoom.getRooms()[number].getClient();

        return obj;

    }*/

    public String[] parseRepoClient(RepositoryClient client, ArrayWorker arrayWorker){
        Integer count = 0;
        String[] str = new String[client.getClients().length*4];
        for (int i = 0; i<client.getClients().length;i++){
            System.arraycopy(parseClient2(client.getClients()[i]),0,str,count,4);
            count = count+4;
        }
        return str;



    }
    public String[] parseClient2(Client client){



        String[] obj = new String[4];
        obj[0] = String.valueOf(client.getNumberRoom());
        obj[1] = client.getSurname();
        obj[2] = client.getDateArrival().toString();
        obj[3] = client.getDateEviction().toString();

        return obj;




    }/*
public String[] parseClient(RepositoryClient repositoryClient,String surname, ArrayWorker arrayWorker){

    Integer number;
    number = arrayWorker.returnNumClient(repositoryClient,surname);

    String[] obj = new String[4];
if(repositoryClient.getClients()[number].getNumberRoom() == null){
        obj[0] = "null";
    }else

{obj[0] = repositoryClient.getClients()[number].getNumberRoom().toString();}
    obj[1] = repositoryClient.getClients()[number].getSurname();
    obj[2] = repositoryClient.getClients()[number].getDateArrival().toString();
    obj[3] = repositoryClient.getClients()[number].getDateEviction().toString();

    return obj;




}
*/
    public String[] parseRepoService(RepositoryService service, ArrayWorker arrayWorker) {
        Integer count = 0;
        String[] str = new String[service.getServices().length*2];
        for (int i = 0; i < service.getServices().length; i++) {
            System.arraycopy(parseService2(service.getServices()[i]), 0, str, count, 2);
            count = count + 2;
        }
        return str;
    }
    public String[] parseService2(Service service){

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
    public String[] parseRepositoryHistory(RepositoryHistoryHotel historyHotel){

        Integer count = 0;
        String[] str = new String[historyHotel.getHistoryHotels().length*4];
        for (int i = 0; i<historyHotel.getHistoryHotels().length;i++){
            System.arraycopy(parseHistoryHotel2(historyHotel.getHistoryHotels()[i]),0,str,count,4);
            count = count+8;
        }
        return str;


    }
    public String[] parseHistoryHotel2(HistoryHotel hotel){



        String[] obj = new String[4];

        obj[0] = String.valueOf(hotel.getNumberRoom());
        obj[1] = parseLast(hotel.getLastThree());
        obj[2] = parseService(hotel.getServices());
        obj[3] = parseDateService(hotel.getServices());

        return obj;
    }

/* public String[] parseHistoryHotel(RepositoryHistoryHotel historyHotel, Integer num,ArrayWorker arrayWorker){

Integer number;

    number = arrayWorker.returnHistory(historyHotel,num);

    String[] obj = new String[4];

    obj[0] = historyHotel.getHistoryHotels()[number].getNumberRoom().toString();
    obj[1] = parseLast(historyHotel.getHistoryHotels()[number].getLastThree());
   obj[2] = parseService(historyHotel.getHistoryHotels()[number].getServices());
    obj[3] = parseDateService(historyHotel.getHistoryHotels()[number].getServices());

    return obj;
}*/
public String parseLast(String[] str){

    String str1 = str[0] + " " + str[1] + " " + str[2];

    return str1;

}

public String parseService(HistoryService[] services){

    String answer = services[0].getService().toString();
    for (int i =1;i<services.length;i++){

        answer = answer + "/" + services[i].getService().toString();

    }
    return answer;
}

public String parseDateService(HistoryService[] services){
    String answer = services[0].getDate().toString();
    for (int i =0;i<services.length;i++){

        answer = answer + "/" + services[i].getDate().toString();

    }
    return answer;


}
}
