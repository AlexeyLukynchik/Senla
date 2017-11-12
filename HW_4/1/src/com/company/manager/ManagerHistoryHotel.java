package com.company.manager;

import com.company.worker.ArrayWorker;
import com.company.model.HistoryHotel;
import com.company.repository.RepositoryHistoryHotel;

import java.util.Comparator;


public class ManagerHistoryHotel {
    private RepositoryHistoryHotel hotels;

    public RepositoryHistoryHotel getHotels() {
        return hotels;
    }

    public void setHotels(RepositoryHistoryHotel hotels) {
        this.hotels = hotels;
    }

    public ManagerHistoryHotel(RepositoryHistoryHotel hotels) {
        this.hotels = hotels;
    }

    public void addClient(HistoryHotel historyHotel, ArrayWorker arrayWorker) {


        hotels.addClient(historyHotel, arrayWorker);


    }

    public HistoryHotel[] sortHistoryHotel(Comparator comparator) {


        return hotels.sortHistoryHotel(comparator);

    }

}
