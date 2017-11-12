package com.company.model;

import com.company.model.Entity;

import java.util.Date;

/**
 * Created by Алексей on 09.11.2017.
 */
public class Room extends Entity {
    private Double price;
    private Integer capacity;
    private Integer countStars;
    private String status;
    private Date dateArrival;
    private Date dateEviction;
    private Integer number;
    private Integer ID;


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Room(Double price, Integer capacity, Integer countStars, String status, Date dateArrival, Date dateEviction, Integer number, Integer ID) {
        this.price = price;
        this.capacity = capacity;
        this.countStars = countStars;
        this.status = status;
        this.dateArrival = dateArrival;
        this.dateEviction = dateEviction;
        this.number = number;
        this.ID = ID;

    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getCountStars() {
        return countStars;
    }

    public void setCountStars(Integer countStars) {
        this.countStars = countStars;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(Date dateArrival) {
        this.dateArrival = dateArrival;
    }

    public Date getDateEviction() {
        return dateEviction;
    }

    public void setDateEviction(Date dateEviction) {
        this.dateEviction = dateEviction;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return
                "price=" + price +
                        ", capacity=" + capacity +
                        ", countStars=" + countStars +
                        ", status='" + status + '\'' +
                        ", dateArrival=" + dateArrival +
                        ", dateEviction=" + dateEviction +
                        ", number=" + number +
                        ", ID =" + ID
                ;
    }
}

