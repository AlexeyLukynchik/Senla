package com.company;


public class CancelReservation {

    public static Board canselReservation(Board board, String surname) {
        /* can be entered surname*/


        board.getBoard()[SearchNumber.searchNumber(board, surname)] = "free";
        return board;


    }

}
