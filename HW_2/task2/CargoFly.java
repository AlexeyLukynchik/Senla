class CargoFly extends Fly {



private Double carrying;

public Double getCarrying(){
return this.carrying;
}
public void setNumber(Double carrying){
this.carrying = carrying;}


public CargoFly(String name, Double num, Double carrying) {
super(num, name);

this.carrying = carrying;
System.out.println("CargoFly created");

}






}