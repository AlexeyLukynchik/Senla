package com.company;


public class ListPassengers {


    public static Board firstFormation(Board board) {

        /*can be entered the number of armor and surnames but until everthing is known*/

        board.getBoard()[0] = "Lukynchik";

        board.getBoard()[1] = "Kant";

        board.getBoard()[2] = "Skoryna";

        return board;


    }

    public static Board add(Board board, String surname) {

        String free = "free";


        board.getBoard()[SearchNumber.searchNumber(board, free)] = surname;
        return board;
    }


}
