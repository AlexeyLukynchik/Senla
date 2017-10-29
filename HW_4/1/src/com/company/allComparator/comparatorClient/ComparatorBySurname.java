package com.company.allComparator.comparatorClient;

import com.company.essence.Client;
import com.company.repository.RepositoryClient;

import java.util.Arrays;
import java.util.Comparator;


public class ComparatorBySurname implements Comparator<Client> {


    @Override
    public int compare(Client o1, Client o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
