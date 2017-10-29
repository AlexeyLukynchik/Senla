package com.company.allComparator.comparatorRoom;

import com.company.essence.Room;

import java.util.Comparator;


public class ComparatorByCapacity implements Comparator<Room> {
    @Override
    public int compare(Room o1, Room o2) {
        return (int) (o1.getCapacity() - o2.getCapacity());
    }
}
