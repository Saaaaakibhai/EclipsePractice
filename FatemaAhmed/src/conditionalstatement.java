import java.util.Scanner;

public class conditionalstatement {
       public static void main(String[]args) {
    	   
    	   Scanner input = new Scanner(System.in);
    	   // taking user input 
    	   System.out.print("Enter any number :");
    	   int n = input.nextInt();
    	   
    	   if(n%2==0) {
    		   System.out.println("Even");
    	   }else {
    		   System.out.println("ODD");
    	   }
       }
}
