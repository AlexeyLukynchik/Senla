package com.company;


public class CancelReservation {

    public static Board canselReservation(Board board) {
        /* can be entered surname*/
        String surname = "Kant";


        board.getBoard()[SearchNumber.searchNumber(board, surname)] = "free";
        return board;


    }

}
