package Abstraction;

public class Rectangle extends Shape{
	private double width;
	private double length;
Rectangle(){
	
}
Rectangle(double width,double length){
	this.width=width;
	this.length=length;
}
public double getWidth() {
	return width;
}
public double getLength() {
	return length;
}
public void setWidth(double width) {
	this.width = width;
}
public void setLength(double length) {
	this.length = length;
}
@Override
public double getArea() {
	return width*length;
}
@Override
public double getPerimeter() {
	return 2*(width+length);
}
@Override
public String toString() {
	return "Rectangle [width=" + width + ", length=" + length + "]";
}

}
