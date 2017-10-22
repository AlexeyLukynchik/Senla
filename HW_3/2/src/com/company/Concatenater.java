package com.company;


public class Concatenater {

    public int concat(int[] massif) {
        String concat = Integer.toString(massif[0]) + Integer.toString(massif[1]);

        return Integer.parseInt(concat);


    }
}
