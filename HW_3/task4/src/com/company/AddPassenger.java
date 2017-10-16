package com.company;


public class AddPassenger {


    public static Board add(Board board, String surname) {

        String free = "free";


        board.getBoard()[SearchNumber.searchNumber(board, free)] = surname;
        return board;
    }


}
