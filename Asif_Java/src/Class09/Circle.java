package Class09;

public class Circle {
       //data fields 
	double radius;
	static int numberofObject;
	//Constructors
	Circle(){
		numberofObject++;
	}
	Circle(double newRadius)
	{
		radius = newRadius;
		numberofObject++;
	}
	//methods
	double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	public static void info() {
		System.out.println("numberofObject: "+numberofObject);
		}
}
