class Board {
private Integer seat;
private Integer businessClass;
public Integer getSeat(){
return this.seat;
}
public void setSeat(Integer seat){
this.seat = seat;
}

public Integer getBusinessClass(){
return this.businessClass;
}
public void setBusinessClass(Integer businessClass)
{
this.businessClass = businessClass;
}


Board (Integer seat, Integer businessClass) {

this.seat = seat;
this.businessClass = businessClass;

System.out.println("Board created");

}
}