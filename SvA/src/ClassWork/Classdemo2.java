package ClassWork;

import java.util.Scanner;

public class Classdemo2 {
       public static void main (String[]args)
       {  
    	   Scanner input = new Scanner(System.in);
    	   System.out.println("Enter 4 number: ");
    	  double a = input.nextDouble();
    	  double b= input.nextDouble();
    	  double c = input.nextDouble();
    	  double d = input.nextDouble();
    	  double sum = ((a+b)/c)+2*((a*d)+(b*c));
    	  System.out.printf("The %f ",sum);
       }
}
