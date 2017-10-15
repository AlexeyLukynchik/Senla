package com.company;


public class SysAdmin extends Employee {
    private int floor;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public SysAdmin(String name, String surname, String position, Double salary, int floor) {
        super(name, surname, position, salary);
        this.floor = floor;
    }
}
