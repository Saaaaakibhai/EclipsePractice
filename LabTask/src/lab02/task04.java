package lab02;

import java.util.Scanner;

public class task04 {
	public static void main(String[]args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter anything: ");
            int x = input.nextInt();
            
           int first = x/100;
           int last = x % 10 ;
           if (first == last) {
        	  System.out.println("It's pelindorme");
          }else
          {
        	  System.out.println("It's not a pelindorme");
          }
    }
}