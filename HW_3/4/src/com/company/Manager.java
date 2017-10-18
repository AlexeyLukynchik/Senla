package com.company;


public class Manager implements IManager {
    @Override
    public Board add(Board board, APassenger passenger, Checker checker) {
        String free = "free";


        board.getPassengers()[checker.searchNumber(board, null)] = passenger;
        return board;
    }

    @Override
    public Board canselReservation(Board board, APassenger passenger, Checker checker) {
        board.getPassengers()[checker.searchNumber(board, passenger)] = null;
        return board;
    }

    @Override
    public APassenger[] addFree(APassenger[] board) {
        for (int i = 0; i < board.length; i++)
            board[i] = null;
        return board;
    }
}
