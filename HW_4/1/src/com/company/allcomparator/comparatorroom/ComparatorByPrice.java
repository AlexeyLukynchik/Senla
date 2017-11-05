package com.company.allcomparator.comparatorroom;

import com.company.essence.Room;

import java.util.Comparator;


public class ComparatorByPrice implements Comparator<Room> {
    @Override
    public int compare(Room o1, Room o2) {

        if (o1 != null && o2 != null) {
            return (int) (o1.getPrice() - o2.getPrice());
        } else if (o1 != null && o2 == null) {
            return 1;
        } else {
            return -1;
        }


    }
}
