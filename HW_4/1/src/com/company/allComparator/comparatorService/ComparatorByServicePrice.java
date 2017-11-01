package com.company.allComparator.comparatorService;

import com.company.essence.Service;

import java.util.Comparator;


public class ComparatorByServicePrice implements Comparator<Service> {
    @Override
    public int compare(Service o1, Service o2) {

        if (o1 != null && o2 != null) {
            return (int) (o1.getPrice() - o2.getPrice());
        } else if (o1 != null && o2 == null) {
            return 1;
        } else {
            return -1;
        }

    }
}
