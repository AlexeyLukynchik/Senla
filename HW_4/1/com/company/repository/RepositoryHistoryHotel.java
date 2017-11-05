package com.company.repository;

import com.company.essence.HistoryHotel;


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
