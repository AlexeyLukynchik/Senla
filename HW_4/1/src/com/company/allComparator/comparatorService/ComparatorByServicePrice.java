package com.company.allComparator.comparatorService;

import com.company.essence.Service;

import java.util.Comparator;

/**
 * Created by Алексей on 25.10.2017.
 */
public class ComparatorByServicePrice implements Comparator<Service> {
    @Override
    public int compare(Service o1, Service o2) {
        return (int)(o1.getPrice()-o2.getPrice());
    }
}
