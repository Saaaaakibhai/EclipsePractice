import java.util.Scanner;

public class HW01 {
          public static void main (String []args)
          {
        	  Scanner input = new Scanner (System.in);
        	  System.out.print("Enter weight in pounds: ");
        	  double x = input.nextDouble();
        	  System.out.print("Enter height in inches: ");
        	  double y = input.nextDouble();
        	  double kg = x*0.45359237;//pound to kg
        	  double m = y*0.0254;//inch to meter
        	  double meter = Math.pow(m, 2);
        	  double BMI = kg/meter;
        	  System.out.printf("BMI is %.4f",BMI); input.close();
          }
}
