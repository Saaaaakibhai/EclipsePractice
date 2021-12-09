package Abstraction;

public class Circle extends Shape {
   private double radius;
   Circle(){
	   
   }
   Circle(double radius){
	this.radius=radius;   
   }
   Circle(double radius,String color,boolean filled){
	   this.radius=radius;	   
   }
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
@Override
public double getArea(){
	return Math.PI*(radius*radius);
}
@Override
public double getPerimeter() {
	return 2*Math.PI*radius;
}
@Override
public String toString() {
	return "Circle [radius=" + radius + "]";
}
}
