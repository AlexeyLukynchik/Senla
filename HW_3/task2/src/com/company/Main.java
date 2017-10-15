package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        RandomMassif randomMassif = new RandomMassif();
        GenerationRandom generationRandom = new GenerationRandom();
        int[] intermediate = randomMassif.randomMassif(generationRandom.generationRandom());
        Concatenation concatenation = new Concatenation();
        int concat = concatenation.concatenation(intermediate);
        Subtraction subtraction = new Subtraction();
        subtraction.subtraction(intermediate, concat);
    }
}
