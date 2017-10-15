package com.company;


class Subtraction implements ISubtraction {
    @Override
    public void subtraction(int[] randomMassif, int concat) {
        concat = concat - randomMassif[randomMassif.length - 1];
        System.out.println("Answer =" + concat);
    }
}
