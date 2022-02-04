package Lab11;

import java.util.Scanner;

/****(ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:
■ Creates an array with 100 randomly chosen integers.
■ Prompts the user to enter the index of the array, then displays the corresponding element value. If
the specified index is out of bounds, display the message Out of Bounds.*****///



public class Task02 {
public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	int []array = new int[100];
	for(int i=0;i<array.length;i++) {
		array [i]=(int)(Math.random()*100+1);
	}
	System.out.println("Enter the index of the array: ");
	int value = input.nextInt();
	try {
		System.out.println(array[value]);
	}catch(ArrayIndexOutOfBoundsException arrayIndexOutofBoundsException) {
		System.out.println("Out of Bounds");
	}
  }
}
