package com.company.allComparator.comparatorClient;

import com.company.essence.Client;

import java.util.Comparator;


public class ComparatorByDate implements Comparator<Client> {
    @Override
    public int compare(Client o1, Client o2) {
        return o1.getDateEviction().compareTo(o2.getDateEviction());
    }
}
