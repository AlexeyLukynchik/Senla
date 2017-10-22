package com.company;


public class Checker {
    public int search(Board board) {

        int count = 0;

        for (int i = 0; i < board.getPassengers().length; i++) {

            if (board.getPassengers()[i] == null)
                count++;
        }

        return count;

    }

    public int searchNumber(Board board, APassenger search) {


        int count = 0;
        for (int i = 0; i < board.getPassengers().length; i++) {
            if (board.getPassengers()[i] == search) {
                count = i;
                break;
            }
        }
        return count;
    }
}
