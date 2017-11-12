package com.company.allcomparator.comparatorclient;

import com.company.model.*;

import java.util.Comparator;


public class ComparatorByDate implements Comparator<Client> {
    @Override
    public int compare(Client o1, Client o2) {
        if (o1 != null && o2 != null) {
            return o1.getDateEviction().compareTo(o2.getDateEviction());
        } else if (o1 != null && o2 == null) {
            return 1;
        } else {
            return -1;
        }


    }
}
