package com.company.allComparator.comparatorHistoryService;

import com.company.essence.HistoryService;

import java.util.Comparator;


public class ComparatorHistoryServiceByPrice implements Comparator<HistoryService> {
    @Override
    public int compare(HistoryService o1, HistoryService o2) {


        if (o1 != null && o2 != null) {
            return (int) (o1.getService().getPrice() - o2.getService().getPrice());
        } else if (o1 != null && o2 == null) {
            return 1;
        } else {
            return -1;
        }


    }
}
