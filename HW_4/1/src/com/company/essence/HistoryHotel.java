package com.company.essence;

import java.util.Arrays;


public class HistoryHotel extends Entity {

    private Integer numberRoom;
    private String[] lastThree;
    private HistoryService[] services;

    public HistoryHotel(Integer numberRoom) {
        this.numberRoom = numberRoom;
        this.lastThree = new String[3];
        this.services = new HistoryService[10];
    }

    public HistoryHotel(Integer numberRoom, String[] lastThree, HistoryService[] services) {
        this.numberRoom = numberRoom;
        this.lastThree = lastThree;
        this.services = services;
    }

    public Integer getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(Integer numberRoom) {
        this.numberRoom = numberRoom;
    }

    public String[] getLastThree() {
        return lastThree;
    }

    public void setLastThree(String[] lastThree) {
        this.lastThree = lastThree;
    }


    public String[] changeLastClient(Room room) {

        lastThree[2] = lastThree[1];
        lastThree[1] = lastThree[0];
        lastThree[0] = room.getClient();
        return lastThree;
    }

    @Override
    public String toString() {
        return "HistoryHotel{" +
                "numberRoom=" + numberRoom +
                ", lastThree=" + Arrays.toString(lastThree) +
                ", services=" + Arrays.toString(services) +
                '}';
    }

    public HistoryService[] getServices() {
        return services;
    }

    public void setServices(HistoryService[] services) {
        this.services = services;
    }
}
