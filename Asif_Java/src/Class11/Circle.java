package Class11;

public class Circle extends Shape{
                    private double radius =4;
                    @Override
                    public double getArea() {
                    	return Math.PI*Math.pow(radius,2);
                    }

}
