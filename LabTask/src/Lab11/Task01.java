package Lab11;

import java.util.InputMismatchException;
import java.util.Scanner;

/****(InputMismatchException) Write a program that prompts the user to read two integers and displaystheir sum. 
Your program should prompt the user to read the number again if the input is incorrect*************************////


public class Task01 {
           public static void main(String[]args) {
        	   Scanner input = new Scanner(System.in);
        	   System.out.println("Enter two integers: ");
        	   int sum=0;
        	   boolean decision = true;
        	   do {
        		   try {
        			   int a = input.nextInt();
        			   int b = input.nextInt();
        			   sum = a + b;
        			   System.out.println("sum = "+sum);
        			   decision = false;
        		   }catch (InputMismatchException e) {
                       System.out.print("Enter Only integers: ");
                       input.nextLine();
        		       } 
                   }while(decision);
        	   System.out.println("Execute next commands.....");
           }
}

