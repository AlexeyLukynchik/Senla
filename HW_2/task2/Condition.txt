class Condition {

private Integer oil;

private Boolean sound;

public Integer getOil(){
return this.oil;
}
public void setOil(Integer Oil){
this.oil = oil;
}


public Boolean  getSound(){
return this.sound;
}
public void setSound(Boolean  sound){
this.sound = sound;
}


Condition( Integer oil, Boolean  sound) {

this.oil = oil;
this.sound = sound;
System.out.println("Condition created");
}
}
