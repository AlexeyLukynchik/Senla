package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String[] cessna = new String[3];
        Board boardGrodnoLida = new Board(cessna);


        GrodnoLida grodnoLida = new GrodnoLida("Grodno", "Lida", "14:30", ListPassengers.firstFormation(boardGrodnoLida), Status.departed(), "GrodnoAvia", "Cessna 182", SearchFreePlaces.search(boardGrodnoLida));
        grodnoLida.setFreePlaces(SearchFreePlaces.search(grodnoLida.getBoard()));
        System.out.println(grodnoLida.toString());
        grodnoLida.setBoard(CancelReservation.canselReservation(grodnoLida.getBoard()));

        // System.out.println(grodnoLida.toString());

        grodnoLida.setFlightStatus(Status.delayed());

        // System.out.println(grodnoLida.toString());

        grodnoLida.setBoard(ListPassengers.add(grodnoLida.getBoard(), "Vitovt"));

        //System.out.println(grodnoLida.toString());
        grodnoLida.setFreePlaces(SearchFreePlaces.search(grodnoLida.getBoard()));
        AFlight[] flights = new AFlight[2];

        flights[0] = grodnoLida;

        Departures departures = new Departures(flights);
        System.out.println(departures.toString());

        String[] hawker = new String[5];
        Board boardSlonimBelostock = new Board(hawker);

        SlonimBelostock slonimBelostock = new SlonimBelostock("Slonim", "Belostock", "23:58", ListPassengers.firstFormation(boardSlonimBelostock), Status.departed(), "SlonimAirlines", "Hawker 400", SearchFreePlaces.search(boardSlonimBelostock));
        slonimBelostock.getBoard().getBoard()[3] = "free";
        slonimBelostock.getBoard().getBoard()[4] = "free";

        flights[1] = slonimBelostock;
        slonimBelostock.setFreePlaces(SearchFreePlaces.search(slonimBelostock.getBoard()));
        System.out.println(departures.toString());
        slonimBelostock.setBoard(ListPassengers.add(slonimBelostock.getBoard(), "Java"));
        slonimBelostock.setBoard(ListPassengers.add(slonimBelostock.getBoard(), "Alesha"));
        slonimBelostock.setFreePlaces(SearchFreePlaces.search(slonimBelostock.getBoard()));

        System.out.println(departures.toString());


    }
}
