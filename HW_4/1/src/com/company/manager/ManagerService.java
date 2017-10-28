package com.company.manager;

import com.company.worker.ArrayWorker;
import com.company.essence.HistoryHotel;
import com.company.essence.HistoryService;
import com.company.essence.Service;
import com.company.repository.RepositoryService;

/**
 * Created by Алексей on 25.10.2017.
 */
public class ManagerService {

    public void addService(Service service, RepositoryService repositoryService, ArrayWorker arrayWorker){


        if(arrayWorker.changeLength(repositoryService.getServices())== true)
        {
            arrayWorker.addEntity(repositoryService.getServices(),arrayWorker.returnNumberFree(repositoryService.getServices()),service);

        }
        else
        {

            arrayWorker.expasionMassiv(repositoryService.getServices());
           repositoryService.getServices()[repositoryService.getServices().length-1] = service;

        }



    }
public void addHistoryService(HistoryService historyService, HistoryHotel historyHotel, ArrayWorker arrayWorker){
    if(arrayWorker.changeLength(historyHotel.getServices())== true)
    {
        arrayWorker.addEntity(historyHotel.getServices(),arrayWorker.returnNumberFree(historyHotel.getServices()),historyService);

    }
    else
    {

        arrayWorker.expasionMassiv(historyHotel.getServices());
       historyHotel.getServices()[historyHotel.getServices().length-1] =historyService;

    }



}

}
