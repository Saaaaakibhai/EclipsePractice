package lab3;

import java.util.Scanner;

/*(Count positive and negative numbers and compute the average of numbers).
Write a program that reads an unspecified number of integers, 
determines how many positive and negative values have been read,
and computes the total and average of the input values (not counting zeros).
Your program ends with the input 0. Display the average as a floating-point number.*/

public class task01 {
	public static void main(String[]args){
		 int pos = 0,neg =0, i = 0;
		 double sum = 0;
		 double arr[] = new double [5];
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter an integer, the input ends if it is 0: ");		 
		 for(i=0;i<5;i++) 
			 arr [i] = input.nextInt();
		 int count = 0;
		for(i =0;i<5;i++) {
			 if(arr[i]==0) 
				 continue;
			 else if (arr[i]>0)
				 pos++;
			 else 
			    neg++; 
			          count++;
			 }		
		for(i=0;i<arr.length;i++) {
              sum = sum + arr[i];
		 }
		double ava=sum/count;
		System.out.println("The number of positives is: "+pos);
		System.out.println("The number of negetive is: "+neg);
		System.out.println("The total is: "+sum);
		System.out.println("The average is: "+ava);
		}		
 }
	
