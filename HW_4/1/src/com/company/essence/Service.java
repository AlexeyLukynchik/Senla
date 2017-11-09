package com.company.essence;

import com.company.essence.Entity;

import java.util.Date;


public class Service extends Entity {
    private String name;

    private Double price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Service(String name, Double price) {
        this.name = name;
        this.price = price;

    }

    @Override
    public String toString() {
        return
                name + " " +
                        +price
                ;
    }
}
