class PassengerFly extends Fly{ 

//private Double number;
//private String airline;
private Board board;

public Board getBoard(){
return this.board;
}
public void setBoard(Board board){
this.board = board;
}

public PassengerFly(String name, Double num, Board board) {
super(num, name);

this.board = board;
System.out.println("PassengerFly created");

}


}
