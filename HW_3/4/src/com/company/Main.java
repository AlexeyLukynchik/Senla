package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        APassenger[] cessna = new APassenger[3];
        Checker checker = new Checker();
        Manager manager = new Manager();
        Board boardGrodnoLida = new Board(manager.addFree(cessna));

        Lukynchik lukynchik = new Lukynchik("Lukynchik");
        Skoryna skoryna = new Skoryna("Skoryna");
        Vitovt vitovt = new Vitovt("Vitovt");

        manager.add(boardGrodnoLida, lukynchik, checker);
        manager.add(boardGrodnoLida, skoryna, checker);
        manager.add(boardGrodnoLida, vitovt, checker);
        Status status = new Status();

        GrodnoLida grodnoLida = new GrodnoLida("Grodno", "Lida", "14:30", boardGrodnoLida, status.departed(), "GrodnoAvia", "Cessna 182", checker.search(boardGrodnoLida));
        Printer printer = new Printer();

        Departure departure = new Departure(2);

        departure.getAFlights()[0] = grodnoLida;

        printer.printDeparture(departure);

        grodnoLida.setBoard(manager.canselReservation(grodnoLida.getBoard(), vitovt, checker));
        printer.printDeparture(departure);


    }
}
