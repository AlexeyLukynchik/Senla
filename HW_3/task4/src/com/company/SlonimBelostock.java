package com.company;


public class SlonimBelostock extends Flight {


    private String typeFly;

    public String getTypeFly() {
        return typeFly;
    }

    public void setTypeFly(String typeFly) {
        this.typeFly = typeFly;
    }

    private int freePlaces;

    public int getFreePlaces() {
        return freePlaces;
    }

    public void setFreePlaces(int freePlaces) {
        this.freePlaces = freePlaces;
    }

    public SlonimBelostock(String pointA, String pointB, String departureTime, Board board, String flightStatus, String airline, String typeFly, int freePlaces) {
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
