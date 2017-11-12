package com.company.model;

import java.util.Date;

/**
 * Created by Алексей on 09.11.2017.
 */
public class HistoryService extends Entity {
    private Service service;

    private Date date;

    public HistoryService(Service service, Date date) {
        this.service = service;
        this.date = date;
    }

    public Service getService() {

        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "HistoryService{" +
                "service=" + service +
                ", date=" + date +
                '}';
    }
}

