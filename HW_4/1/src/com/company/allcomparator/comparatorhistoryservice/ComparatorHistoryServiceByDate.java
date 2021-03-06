package com.company.allcomparator.comparatorhistoryservice;

import com.company.model.*;

import java.util.Comparator;


public class ComparatorHistoryServiceByDate implements Comparator<HistoryService> {
    @Override
    public int compare(HistoryService o1, HistoryService o2) {

        if (o1 != null && o2 != null) {
            return o1.getDate().compareTo(o2.getDate());
        } else if (o1 != null && o2 == null) {
            return 1;
        } else {
            return -1;
        }


    }
}
