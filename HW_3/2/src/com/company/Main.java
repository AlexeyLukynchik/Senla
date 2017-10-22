package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Random random = new Random();
        CreaterMassif createrMassif = new CreaterMassif();
        Concatenater concatenater = new Concatenater();
        GeneraterRandom generaterRandom = new GeneraterRandom();
        Subtracter subtracter = new Subtracter();
        Printer printer = new Printer();

        printer.print(subtracter.subtract(createrMassif.create(random, generaterRandom), concatenater));

    }
}
