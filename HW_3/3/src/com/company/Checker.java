package com.company;


public class Checker {

    public boolean checkLength(AEmployee[] employees) {

        boolean place = false;
        if (employees[employees.length - 1] == null)
            return place = true;
        else
            return place;


    }

    public int checkNumber(AEmployee[] employees) {
        int free = 0;
        for (int i = 0; i < employees.length; i++) {

            if (employees[i] == null) {
                free = i;
                break;

            }

        }
        return free;

    }
}
