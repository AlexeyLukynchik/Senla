package com.company.allComparator.comparatorRoom;

import com.company.essence.Entity;
import com.company.essence.Room;

import java.util.Comparator;


public class ComparatorByPrice implements Comparator<Room> {
    @Override
    public int compare(Room o1, Room o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
