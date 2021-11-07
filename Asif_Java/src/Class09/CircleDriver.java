package Class09;

import java.util.Scanner;

public class CircleDriver {
  public static void main(String[]args)
  {
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter Radius: ");
	  double r = input.nextDouble();
	  Circle c1 = new Circle(r);
	  System.out.println(c1.getArea());
	  //Calling static method
	  //Circle.info
	  input.close();
   }

}
