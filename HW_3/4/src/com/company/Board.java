package com.company;

import java.util.Arrays;


public class Board {

    private APassenger[] passengers;

    @Override
    public String toString() {
        return "Board{" +
                "passengers=" + Arrays.toString(passengers) +
                '}';
    }

    public Board(APassenger[] passengers) {
        this.passengers = passengers;
    }

    public APassenger[] getPassengers() {

        return passengers;
    }

    public void setPassengers(APassenger[] passengers) {
        this.passengers = passengers;
    }
}
