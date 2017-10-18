package com.company;

import java.util.Random;


public class CreaterMassif {

    public int[] create(Random random, GeneraterRandom generaterRandom) {
        int[] massifRandom = new int[3];
        for (int i = 0; i < massifRandom.length; i++) {

            massifRandom[i] = generaterRandom.generate(random);

        }
        return massifRandom;

    }
}
