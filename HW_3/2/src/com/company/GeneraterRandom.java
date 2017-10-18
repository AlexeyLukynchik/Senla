package com.company;

import java.util.Random;


public class GeneraterRandom {
    private final int NUMBER_FOR_RANDOM = 100;

    public int generate(Random random) {

        return NUMBER_FOR_RANDOM + random.nextInt(999 - NUMBER_FOR_RANDOM);

    }

}
