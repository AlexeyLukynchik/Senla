package com.company.worker;


public enum Star {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);


    private final int value;

    private Star(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}



