package com.company.allComparator.comparatorHistoryService;

import com.company.essence.HistoryService;

import java.util.Comparator;


public class ComparatorHistoryServiceByPrice implements Comparator<HistoryService> {
    @Override
    public int compare(HistoryService o1, HistoryService o2) {
        return (int) (o1.getService().getPrice() - o2.getService().getPrice());
    }
}
