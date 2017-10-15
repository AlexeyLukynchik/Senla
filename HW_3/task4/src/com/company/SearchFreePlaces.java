package com.company;

/**
 * Created by Алексей on 14.10.2017.
 */
public class SearchFreePlaces {

    public static int search(Board board) {

        int count = 0;

        for (int i = 0; i < board.getBoard().length; i++) {

            if (board.getBoard()[i] == "free")
                count++;
        }

        return count;

    }
}
