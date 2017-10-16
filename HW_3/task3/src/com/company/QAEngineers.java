package com.company;

/**
 * Created by Алексей on 15.10.2017.
 */
public class QAEngineers extends AEmployee {

    private int floor;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public QAEngineers(String name, String surname, String position, Double salary, int floor) {
        super(name, surname, position, salary);
        this.floor = floor;
    }
}
