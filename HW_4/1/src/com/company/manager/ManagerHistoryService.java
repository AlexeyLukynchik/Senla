package com.company.manager;

import com.company.essence.HistoryHotel;
import com.company.essence.HistoryService;
import com.company.repository.RepositoryHistoryHotel;
import com.company.worker.ArrayWorker;

import java.util.Arrays;
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


    public HistoryService[] sortHistoryService(RepositoryHistoryHotel hotel, Comparator comparator, Integer num) {

        HistoryService[] services = getHotels().getHistoryHotels()[num].getServices();
        Arrays.sort(services, comparator);

        return services;

    }


    public Integer searchNumber(RepositoryHistoryHotel hotel, Integer integer) {

        Integer count = 0;

        for (int i = 0; i < getHotels().getHistoryHotels().length; i++) {

            if (getHotels().getHistoryHotels()[i].getNumberRoom() == integer)

                count = i;
        }

        return count;

    }

    public void addHistoryService(HistoryService historyService, HistoryHotel historyHotel, ArrayWorker arrayWorker) {
        if (arrayWorker.changeLength(historyHotel.getServices()) == true) {
            arrayWorker.addEntity(historyHotel.getServices(), arrayWorker.returnNumberFree(historyHotel.getServices()), historyService);

        } else {

            arrayWorker.expasionMassiv(historyHotel.getServices());
            historyHotel.getServices()[historyHotel.getServices().length - 1] = historyService;

        }


    }

    public Integer returnCountHistory(RepositoryHistoryHotel hotel) {

        Integer count = 0;

        for (int i = 0; i <getHotels().getHistoryHotels().length; i++) {

            for (int j = 0; j < getHotels().getHistoryHotels()[i].getServices().length; j++)
                if (getHotels().getHistoryHotels()[i].getServices()[j] != null) {
                    count++;
                }

        }
        return count;
    }

}
