package Class18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMatch {
         public static void main(String[]args) {
        	 Scanner input = new Scanner(System.in);
        	 boolean flag = true;
        	 do {
        		 try {
        			 System.out.println("Enter an integer: ");
        			 int n = input.nextInt();
        			 System.out.println("You have entered: "+n);
        			 flag=false;
        		 }catch(InputMismatchException ex) {
        			 System.out.println("Please enter only integer!"+ex);
        			 input.nextLine();
        		 }
        	 }while(flag);
        		 System.out.println("Execute next commands.....");
        		 
         }
}
