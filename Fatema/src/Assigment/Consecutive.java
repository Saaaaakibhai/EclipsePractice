package Assigment;

import java.util.Scanner;

public class Consecutive
{   
    // Driver Code
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many element you wanna enter: "); 
        int n = input.nextInt();
        System.out.println("Enter the elements of the array: ");  
        int []array = new int[10];
        for(int i=0; i<n; i++)  
        {  
        array[i]=input.nextInt();  
        } 
        int count = 0;
        for (int i = 0; i < n - 1; i++)
        {
            // If consecutive elements are same
            if (array[i] == array[i + 1])
                count++;
        }
        
		do {
        System.out.println(n);
        }while(n==3);
    }

}

