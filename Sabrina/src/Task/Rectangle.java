package Task;

public class Rectangle extends Shape{
private double side1=4.0;
private double side2=5.0;

Rectangle(){
	
}
Rectangle(String name,double side1,double side2){
	super(name);
	this.side1=side1;
	this.side2=side2;
}
public double getSide1() {
	return side1;
}
public double getSide2() {
	return side2;
}
public void setSide1(double side1) {
	this.side1 = side1;
}
public void setSide2(double side2) {
	this.side2 = side2;
}
public double getArea() {
	return side1*side2;
}
public double getPerimeter() {
	return 2*(side1+side2);

}
}