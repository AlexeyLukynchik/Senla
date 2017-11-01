package com.company.manager;

import com.company.worker.ArrayWorker;
import com.company.essence.HistoryHotel;
import com.company.essence.HistoryService;
import com.company.essence.Service;
import com.company.repository.RepositoryService;

import java.util.Arrays;
import java.util.Comparator;


public class ManagerService {

    public void addService(Service service, RepositoryService repositoryService, ArrayWorker arrayWorker) {


        if (arrayWorker.changeLength(repositoryService.getServices()) == true) {
            arrayWorker.addEntity(repositoryService.getServices(), arrayWorker.returnNumberFree(repositoryService.getServices()), service);

        } else {

            arrayWorker.expasionMassiv(repositoryService.getServices());
            repositoryService.getServices()[repositoryService.getServices().length - 1] = service;

        }


    }


    public Service[] sortService(RepositoryService service, Comparator comparator) {

        Service[] services = service.getServices();
        Arrays.sort(services, comparator);
        return services;

    }

   /* public void addHistoryService(HistoryService historyService, HistoryHotel historyHotel, ArrayWorker arrayWorker) {
        if (arrayWorker.changeLength(historyHotel.getServices()) == true) {
            arrayWorker.addEntity(historyHotel.getServices(), arrayWorker.returnNumberFree(historyHotel.getServices()), historyService);

        } else {

            arrayWorker.expasionMassiv(historyHotel.getServices());
            historyHotel.getServices()[historyHotel.getServices().length - 1] = historyService;

        }


    }
*/
}
