package com.company.repository;

import com.company.worker.ArrayWorker;
import com.company.model.HistoryHotel;
import com.company.model.HistoryService;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Алексей on 09.11.2017.
 */
public class RepositoryHistoryHotel {

    public HistoryHotel[] hotels;

    public RepositoryHistoryHotel() {
    }

    public RepositoryHistoryHotel(HistoryHotel[] hotels) {
        this.hotels = hotels;
    }

    public void addClient(HistoryHotel historyHotel, ArrayWorker arrayWorker) {


        if (arrayWorker.changeLength(hotels) == true) {
            arrayWorker.addEntity(hotels, arrayWorker.returnNumberFree(hotels), historyHotel);

        } else {

            arrayWorker.expasionMassiv(hotels);
            hotels[hotels.length - 1] = historyHotel;

        }


    }

    public HistoryHotel[] sortHistoryHotel(Comparator comparator) {

        HistoryHotel[] hotels1 = hotels;
        Arrays.sort(hotels1, comparator);
        return hotels1;

    }

    public HistoryService[] sortHistoryService(Comparator comparator, Integer num) {

        HistoryService[] services = hotels[returnNum(num)].getServices();
        Arrays.sort(services, comparator);

        return services;

    }

    public int returnNum(Integer num) {
        int count = 0;
        for (int i = 0; i < hotels.length; i++) {
            if (hotels[i].getNumberRoom() == num) {
                count = i;
            }

        }
        return count;
    }

    public Integer searchNumber(Integer integer) {

        Integer count = 0;

        for (int i = 0; i < hotels.length; i++) {

            if (hotels[i].getNumberRoom() == integer)

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

    public Integer returnCountHistory() {

        Integer count = 0;

        for (int i = 0; i < hotels.length; i++) {

            for (int j = 0; j < hotels[i].getServices().length; j++)
                if (hotels[i].getServices()[j] != null) {
                    count++;
                }

        }
        return count;
    }
}
