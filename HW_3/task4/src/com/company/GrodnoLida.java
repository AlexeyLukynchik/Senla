package com.company;


public class GrodnoLida extends Flight {

    private String typeFly;

    public String getTypeFly() {
        return typeFly;
    }

    private int freePlaces;

    public int getFreePlaces() {
        return freePlaces;
    }

    public void setFreePlaces(int freePlaces) {
        this.freePlaces = freePlaces;
    }

    public void setTypeFly(String typeFly) {
        this.typeFly = typeFly;
    }

    public GrodnoLida(String pointA, String pointB, String departureTime, Board board, String flightStatus, String airline, String typeFly, int freePlaces) {
        super(pointA, pointB, departureTime, board, flightStatus, airline);
        this.typeFly = typeFly;
        this.freePlaces = freePlaces;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "pointA='" + getPointA() + '\'' +
                ", pointB='" + getPointB() + '\'' +
                ",departureTime=" + getDepartureTime() +
                ", board=" + getBoard() +
                ", flightStatus='" + getFlightStatus() + '\'' +
                ", airline='" + getAirline() + '\'' +
                ",typeFly=" + getTypeFly() +
                ",freePlaces=" + getFreePlaces() +
                '}';
    }
}
