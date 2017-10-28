package com.company.repository;

import com.company.essence.HistoryHotel;

/**
 * Created by Алексей on 24.10.2017.
 */
public class RepositoryHistoryHotel {

    private HistoryHotel[] historyHotels;

    public HistoryHotel[] getHistoryHotels() {
        return historyHotels;
    }

    public void setHistoryHotels(HistoryHotel[] historyHotels) {
        this.historyHotels = historyHotels;
    }

    public RepositoryHistoryHotel() {
        this.historyHotels = new HistoryHotel[5];
    }
}
