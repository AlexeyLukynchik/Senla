package com.company;


public class SearchNumber {

    public static int searchNumber(Board board, String search) {


        int count = 0;
        for (int i = 0; i < board.getBoard().length; i++) {
            if (search.compareTo(board.getBoard()[i]) == 0) {
                count = i;
                break;
            }
        }
        return count;
    }
}
