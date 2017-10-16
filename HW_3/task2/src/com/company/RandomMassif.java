package com.company;

import java.util.Random;


public class RandomMassif implements IRandomMassif {
    private final int SIZE_MASSIF = 3;
    private final int NUMBER_FOR_RANDOM = 100;

    @Override
    public int[] randomMassif(Random random) {

        int[] randomNumber = new int[SIZE_MASSIF];
        for (int i = 0; i < SIZE_MASSIF; i++) {
            randomNumber[i] = NUMBER_FOR_RANDOM + random.nextInt(999 - NUMBER_FOR_RANDOM);
            System.out.println(randomNumber[i]);
        }
        return randomNumber;


    }
}
