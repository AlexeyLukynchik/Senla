package com.company.manager;

import com.company.worker.ArrayWorker;
import com.company.essence.HistoryHotel;
import com.company.repository.RepositoryHistoryHotel;

import java.util.Arrays;
import java.util.Comparator;


public class ManagerHistoryHotel {

    public void addClient(HistoryHotel historyHotel, RepositoryHistoryHotel repositoryHistoryHotel, ArrayWorker arrayWorker) {


        if (arrayWorker.changeLength(repositoryHistoryHotel.getHistoryHotels()) == true) {
            arrayWorker.addEntity(repositoryHistoryHotel.getHistoryHotels(), arrayWorker.returnNumberFree(repositoryHistoryHotel.getHistoryHotels()), historyHotel);

        } else {

            arrayWorker.expasionMassiv(repositoryHistoryHotel.getHistoryHotels());
            repositoryHistoryHotel.getHistoryHotels()[repositoryHistoryHotel.getHistoryHotels().length - 1] = historyHotel;

        }


    }

    public HistoryHotel[] sortHistoryHotel(RepositoryHistoryHotel hotel, Comparator comparator) {

        HistoryHotel[] hotels = hotel.getHistoryHotels();
        Arrays.sort(hotels, comparator);
        return hotels;

    }

}
