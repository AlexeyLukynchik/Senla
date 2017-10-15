package com.company;


public abstract class Flight {

    private String pointA;
    private String pointB;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public String getPointB() {

        return pointB;
    }

    public void setPointB(String pointB) {
        this.pointB = pointB;
    }

    private Board board;
    private String flightStatus;
    private String airline;
    private String departureTime;

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getPointA() {
        return pointA;
    }

    public void setPointA(String pointA) {
        this.pointA = pointA;
    }

    public Flight(String pointA, String pointB, String departureTime, Board board, String flightStatus, String airline) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.departureTime = departureTime;
        this.board = board;
        this.flightStatus = flightStatus;
        this.airline = airline;

    }


}
