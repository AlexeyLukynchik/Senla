package com.company;

import java.util.Random;


public class GenerationRandom implements IGenerationRandom {
    @Override
    public Random generationRandom() {
        Random random = new Random();
        return random;

    }
}
