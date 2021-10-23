import java.util.Scanner;

public class HW02 {
     public static void main (String []args)
     {
    	 Scanner input = new Scanner(System.in);
    	 System.out.print("Enter the subtotal and a gratuity rate: ");
    	 int subtotal = input.nextInt();
    	 double GR = input.nextDouble();
    	 double IV = subtotal*(GR/100);
    	 double total = subtotal + IV;
    	 System.out.println("The gratuity is $"+IV+ " and total is $"+total); input.close(); 
     }
}
