package Lab09;

public class Circle {
	 private double radius;

	    public Circle(double radius) {
	        this.radius = radius;
	    }

	    public double getRadius() {
	        return radius;
	    }

	    public void setRadius(double radius) {
	        this.radius = radius;
	    }


	    public double getArea() {
	        return 2 * Math.PI * radius;
	    }

	    @Override
	    public String toString() {
	        return "Circle{" +
	                "radius=" + radius +
	                '}';
	    }
}
