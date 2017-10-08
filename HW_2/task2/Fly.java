class Fly { 

private Double number;
private String airline;
private Board board;
public Double getNumber(){
return this.number;
}
public void setNumber(Double number){
this.number = number;
}
//////////////////////
public String getAirline(){
return this.airline;
}
public void setAirline(String airline){
this.airline = airline;
}
//////////////
public Board getBoard(){
return this.board;
}
public void setBoard(Board board){
this.board = board;
}

Fly(Double number, String airline, Board board) {

this.number = number;
this.airline = airline;
this.board = board;
System.out.println("Fly created");
}


}
