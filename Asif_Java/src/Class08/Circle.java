package Class08;

public class Circle {
double r;
	
	Circle(){
		
	}
	
	Circle(double r){
		this.r = r;
	}
	
	double getArea() {
		//return Math.PI*r*r;
		return Math.PI*Math.pow(r, 2);
	}

	public static void main(String[] args) {
		Circle c1 = new Circle(5);
		System.out.println("Area: "+c1.getArea());
	}

  }