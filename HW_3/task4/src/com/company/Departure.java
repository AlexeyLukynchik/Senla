package com.company;

import java.util.Arrays;


public class Departure {

    private Flight[] flights;

    public Flight[] getFlights() {
        return flights;
    }

    public void setFlights(Flight[] flights) {
        this.flights = flights;
    }

    public Departure(Flight[] flights) {
        this.flights = flights;
    }

    @Override
    public String toString() {
        return "Departure{" +
                "flights=" + Arrays.toString(flights) +
                '}';
    }
}
