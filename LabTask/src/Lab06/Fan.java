package Lab06;

public class Fan{
   public final int SLOW =1;//constant value "final"
   public final int MEDIUM =2;
   public final int FAST =3;
   
   private int speed;
   private boolean on;
   private double radius;
   String color;
   Fan(){
	   speed =1;
	   on = false;
	   radius =5;
	   color = "blue";
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}

public void turnOn() {
	this.on = true;
}
public void turnOff() {
	this.on=false;
}
public void setOn(boolean on) {
	this.on = on;
}
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
   public String toString() {
	   if(on) {
		   return "The fan speed is "+speed+",color "+color+" and redius "+radius;
	   }else return "Fan is off"+" Fan Color "+color+" and radius "+radius;
   }
}
