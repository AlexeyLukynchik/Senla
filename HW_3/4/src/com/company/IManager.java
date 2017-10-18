package com.company;


public interface IManager {
    public Board add(Board board, APassenger passenger, Checker checker);

    public Board canselReservation(Board board, APassenger passenger, Checker checker);

    public APassenger[] addFree(APassenger[] board);
}
