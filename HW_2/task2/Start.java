class Start {

 public static void main(String[] args){

Board newBoard = new Board (50,1);

Flight newFlight = new Flight(23.29,15.00);

Condition newCoondition = new Condition(5000, true);

Control newControl = new Control();

PassengerFly newFly = new PassengerFly( "GrodnoAvia",230.0, newBoard);
CargoFly newCargo = new CargoFly("SlonimAirline",230.0,10000.15);

newControl.takeoff();

newControl.landing();

}
}


