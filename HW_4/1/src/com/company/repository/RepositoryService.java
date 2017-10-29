package com.company.repository;

import com.company.essence.Entity;
import com.company.essence.Service;

import java.util.Arrays;


public class RepositoryService extends RepositoryEntity {

    private Service[] services;

    public Service[] getServices() {
        return services;
    }

    public void setServices(Service[] services) {
        this.services = services;
    }

    public RepositoryService() {
        this.services = new Service[5];
    }

    @Override
    Entity[] getEntity() {
        return services;
    }

    @Override
    public String toString() {
        return "RepositoryService{" +
                "services=" + Arrays.toString(services) +
                '}';
    }
}
