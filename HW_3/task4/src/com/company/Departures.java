package com.company;

import java.util.Arrays;


public class Departures {

    private Flight[] flights;

    public Flight[] getFlights() {
        return flights;
    }

    public void setFlights(Flight[] flights) {
        this.flights = flights;
    }

    public Departures(Flight[] flights) {
        this.flights = flights;
    }

    @Override
    public String toString() {
        return "Departures{" +
                "flights=" + Arrays.toString(flights) +
                '}';
    }
}
