package com.company.manager;

import com.company.worker.ArrayWorker;
import com.company.model.Service;
import com.company.repository.RepositoryService;

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

    public void addService(Service service, ArrayWorker arrayWorker) {

        services.addService(service, arrayWorker);

    }


    public Service[] sortService(RepositoryService service, Comparator comparator) {


        return services.sortService(comparator);

    }


}
