package com.company.manager;

import com.company.worker.ArrayWorker;
import com.company.essence.HistoryHotel;
import com.company.repository.RepositoryHistoryHotel;

/**
 * Created by Алексей on 25.10.2017.
 */
public class ManagerHistoryHotel {

    public void addClient(HistoryHotel historyHotel, RepositoryHistoryHotel repositoryHistoryHotel, ArrayWorker arrayWorker){


        if(arrayWorker.changeLength(repositoryHistoryHotel.getHistoryHotels())== true)
        {
            arrayWorker.addEntity(repositoryHistoryHotel.getHistoryHotels(),arrayWorker.returnNumberFree(repositoryHistoryHotel.getHistoryHotels()),historyHotel);

        }
        else
        {

            arrayWorker.expasionMassiv(repositoryHistoryHotel.getHistoryHotels());
            repositoryHistoryHotel.getHistoryHotels()[repositoryHistoryHotel.getHistoryHotels().length-1] = historyHotel;

        }



    }


}
