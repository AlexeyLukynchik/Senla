class Flight {

private Double arrival;
private Double departure;

public Double getArrival(){
return this.arrival;
}
public void setArrival(Double arrival){
this.arrival = arrival;
}
public Double getDeparture(){
return this.departure;
}
public void setDeparture(Double departure){
this.departure = departure;
}

Flight(Double arrival, Double departure) {

this.arrival = arrival;
this.departure = departure;

System.out.println("Flight created");
}
}