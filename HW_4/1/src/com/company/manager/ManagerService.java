package com.company.manager;

import com.company.worker.ArrayWorker;
import com.company.essence.HistoryHotel;
import com.company.essence.HistoryService;
import com.company.essence.Service;
import com.company.repository.RepositoryService;

import java.util.Arrays;
import java.util.Comparator;


public class ManagerService {
    private RepositoryService services;

    public RepositoryService getService() {
        return services;
    }

    public void setService(RepositoryService service) {
        this.services = service;
    }

    public ManagerService(RepositoryService services) {
        this.services = services;
    }

    public void addService(Service service, RepositoryService repositoryService, ArrayWorker arrayWorker) {


        if (arrayWorker.changeLength(services.getServices()) == true) {
            arrayWorker.addEntity(services.getServices(), arrayWorker.returnNumberFree(services.getServices()), service);

        } else {

            arrayWorker.expasionMassiv(services.getServices());
            services.getServices()[services.getServices().length - 1] = service;

        }


    }


    public Service[] sortService(RepositoryService service, Comparator comparator) {

        Service[] services = getService().getServices();
        Arrays.sort(services, comparator);
        return services;

    }


}
