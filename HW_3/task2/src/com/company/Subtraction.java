package com.company;


class Subtraction implements ISubtraction {
    @Override
    public int subtraction(int[] randomMassif, int concat) {
        concat = concat - randomMassif[randomMassif.length - 1];
        return concat;
    }
}
