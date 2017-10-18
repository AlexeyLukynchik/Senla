package com.company;

import java.util.Arrays;


public class Departure {
    private AFlight[] AFlights;

    public AFlight[] getAFlights() {
        return AFlights;
    }

    public void setAFlights(AFlight[] AFlights) {
        this.AFlights = AFlights;
    }

    public Departure(int size) {
        this.AFlights = new AFlight[size];
    }

    @Override
    public String toString() {
        return "Departure{" +
                "AFlights=" + Arrays.toString(AFlights) +
                '}';
    }
}
