package com.company;


public class SearchFreePlace {

    public static int search(Board board) {

        int count = 0;

        for (int i = 0; i < board.getBoard().length; i++) {

            if (board.getBoard()[i] == "free")
                count++;
        }

        return count;

    }
}
