package com.company.repository;

import com.company.worker.ArrayWorker;
import com.company.model.Service;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Алексей on 09.11.2017.
 */
public class RepositoryService {
    public Service[] services;

    public RepositoryService() {
    }

    public RepositoryService(Service[] services) {
        this.services = services;
    }

    public void addService(Service service, ArrayWorker arrayWorker) {


        if (arrayWorker.changeLength(services) == true) {
            arrayWorker.addEntity(services, arrayWorker.returnNumberFree(services), service);

        } else {

            arrayWorker.expasionMassiv(services);
            services[services.length - 1] = service;

        }


    }


    public Service[] sortService(Comparator comparator) {

        Service[] services1 = services;
        Arrays.sort(services1, comparator);
        return services1;

    }


    @Override
    public String toString() {
        return "RepositoryService{" +
                "services=" + Arrays.toString(services) +
                '}';
    }
}
