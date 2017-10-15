package com.company;


public class Concatenation implements IConcatenation {
    @Override
    public int concatenation(int[] randomMassif) {
        String concat = Integer.toString(randomMassif[0]) + Integer.toString(randomMassif[1]);

        return Integer.parseInt(concat);

    }
}
