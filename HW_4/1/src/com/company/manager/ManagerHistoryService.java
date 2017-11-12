package com.company.manager;

import com.company.worker.ArrayWorker;
import com.company.model.*;

import com.company.repository.RepositoryHistoryHotel;


import java.util.Comparator;

/**
 * Created by Алексей on 01.11.2017.
 */
public class ManagerHistoryService {
    private RepositoryHistoryHotel hotels;

    public RepositoryHistoryHotel getHotels() {
        return hotels;
    }

    public void setHotels(RepositoryHistoryHotel hotels) {
        this.hotels = hotels;
    }

    public ManagerHistoryService(RepositoryHistoryHotel hotels) {
        this.hotels = hotels;
    }


    public HistoryService[] sortHistoryService(Comparator comparator, Integer num) {


        return hotels.sortHistoryService(comparator, num);

    }

    public int returnNum(Integer num) {

        return hotels.returnNum(num);
    }

    public Integer searchNumber(RepositoryHistoryHotel hotel, Integer integer) {

        return hotels.searchNumber(integer);

    }

    public void addHistoryService(HistoryService historyService, HistoryHotel historyHotel, ArrayWorker arrayWorker) {
        hotels.addHistoryService(historyService, historyHotel, arrayWorker);


    }

    public Integer returnCountHistory() {

        return hotels.returnCountHistory();
    }

}
