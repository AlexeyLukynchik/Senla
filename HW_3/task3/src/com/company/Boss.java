package com.company;


public class Boss extends AEmployee {

    private int floor;


    public Boss(String name, String surname, String position, Double salary, int floor) {
        super(name, surname, position, salary);
        this.floor = floor;
    }
}
