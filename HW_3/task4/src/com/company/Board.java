package com.company;

import java.util.Arrays;


public class Board {

    private String[] board;

    public Board(String[] board) {
        this.board = board;
    }

    public String[] getBoard() {

        return board;
    }

    public void setBoard(String[] board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "Board{" +
                "board=" + Arrays.toString(board) +
                '}';
    }
}
