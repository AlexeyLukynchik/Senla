package com.company.manager;

import com.company.worker.ArrayWorker;
import com.company.essence.HistoryHotel;
import com.company.repository.RepositoryHistoryHotel;

import java.util.Arrays;
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


        if (arrayWorker.changeLength(getHotels().getHistoryHotels()) == true) {
            arrayWorker.addEntity(getHotels().getHistoryHotels(), arrayWorker.returnNumberFree(getHotels().getHistoryHotels()), historyHotel);

        } else {

            arrayWorker.expasionMassiv(getHotels().getHistoryHotels());
            getHotels().getHistoryHotels()[getHotels().getHistoryHotels().length - 1] = historyHotel;

        }


    }

    public HistoryHotel[] sortHistoryHotel(Comparator comparator) {

        HistoryHotel[] hotels = getHotels().getHistoryHotels();
        Arrays.sort(hotels, comparator);
        return hotels;

    }

}
