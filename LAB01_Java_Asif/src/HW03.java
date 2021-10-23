import java.util.Scanner;

public class HW03 {
public static void main (String[]args)
   {
	Scanner input = new Scanner (System.in);
    double cels,farn;
      System.out.print("Enter Celsius: ");
      cels = input.nextDouble();
      farn = ((9*cels)/5)+32;
      System.out.print("Farenheit: "+farn); input.close();
   }
}
