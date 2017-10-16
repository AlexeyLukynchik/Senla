package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String[] cessna = new String[3];
        Board boardGrodnoLida = new Board(cessna);
        boardGrodnoLida.getBoard()[0] = "Lukynchik";

        boardGrodnoLida.getBoard()[1] = "Kant";

        boardGrodnoLida.getBoard()[2] = "Skoryna";

        GrodnoLida grodnoLida = new GrodnoLida("Grodno", "Lida", "14:30", boardGrodnoLida, Status.departed(), "GrodnoAvia", "Cessna 182", SearchFreePlace.search(boardGrodnoLida));
        grodnoLida.setFreePlaces(SearchFreePlace.search(grodnoLida.getBoard()));
        //System.out.println(grodnoLida.toString());
        grodnoLida.setBoard(CancelReservation.canselReservation(grodnoLida.getBoard(), "Kant"));

        // System.out.println(grodnoLida.toString());

        grodnoLida.setFlightStatus(Status.delayed());

        // System.out.println(grodnoLida.toString());

        grodnoLida.setBoard(AddPassenger.add(grodnoLida.getBoard(), "Vitovt"));

        //System.out.println(grodnoLida.toString());
        grodnoLida.setFreePlaces(SearchFreePlace.search(grodnoLida.getBoard()));
        Flight[] flights = new Flight[2];

        flights[0] = grodnoLida;

        Departure departure = new Departure(flights);


        String[] hawker = new String[5];
        Board boardSlonimBelostock = new Board(hawker);
        boardSlonimBelostock.getBoard()[0] = "Ivan Stepanovich";
        boardSlonimBelostock.getBoard()[1] = "Valuxa";
        boardSlonimBelostock.getBoard()[2] = "Olga Nikolaevna";
        boardSlonimBelostock.getBoard()[3] = "free";
        boardSlonimBelostock.getBoard()[4] = "free";
        SlonimBelostock slonimBelostock = new SlonimBelostock("Slonim", "Belostock", "23:58", boardSlonimBelostock, Status.departed(), "SlonimAirlines", "Hawker 400", SearchFreePlace.search(boardSlonimBelostock));


        flights[1] = slonimBelostock;
        slonimBelostock.setFreePlaces(SearchFreePlace.search(slonimBelostock.getBoard()));
        Printer printer = new Printer();
        printer.printDeparture(departure);
        //System.out.println(departure.toString());
        slonimBelostock.setBoard(AddPassenger.add(slonimBelostock.getBoard(), "Java"));
        slonimBelostock.setBoard(AddPassenger.add(slonimBelostock.getBoard(), "Alesha"));
        slonimBelostock.setFreePlaces(SearchFreePlace.search(slonimBelostock.getBoard()));
        printer.printDeparture(departure);
        //System.out.println(departure.toString());


    }
}
