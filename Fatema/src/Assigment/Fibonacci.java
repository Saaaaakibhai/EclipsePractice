package Assigment;

import java.util.*;
public class Fibonacci
{
    public static void main(String []args)
    {

        Scanner sc  = new Scanner(System.in);
        int n;
        System.out.println("Enter a number : "); //Take an integer from User
        n = sc.nextInt();
        int fibbo[] = new int[n]; //Array
        int a=1,b=0,c=0; //Variable Declaration
        int size = fibbo.length; //Length of the series
        for(int i=0; i < size;i++) //Calculation Part
        {
            fibbo[i] = c;
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println("First "+size+" Fibonacci Series : ");
        for(int i = 0; i < size;i++)
        {
            System.out.print(fibbo[i]+"\t"); //Display the array
        }
    }
}