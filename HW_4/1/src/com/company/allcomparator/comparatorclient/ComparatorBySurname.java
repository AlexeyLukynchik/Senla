package com.company.allcomparator.comparatorclient;

import com.company.model.*;

import java.util.Comparator;


public class ComparatorBySurname implements Comparator<Client> {


    @Override
    public int compare(Client o1, Client o2) {

        if (o1 != null && o2 != null) {
            return o1.getSurname().compareTo(o2.getSurname());
        } else if (o1 != null && o2 == null) {
            return 1;
        } else {
            return -1;
        }


    }

}

