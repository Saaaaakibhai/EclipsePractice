package Class06;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  Scanner input = new Scanner(System.in);
			    System.out.print("Enter Row: ");
			    int row = input.nextInt();
			    System.out.print("Enter Column: ");
			    int col = input.nextInt();
			    double[][]arr= new double [row][col];
			    for(int i=0;i<row;i++)
			    {
			    	for(int j=0;j<col;j++)
			    	{
			    		System.out.print("Enter Marks ["+i+"]["+j+"]:");
			    		arr[i][j]=input.nextDouble();	    	}
			    }
			    double sum = 0.0;
			    for(int i=0;i<row;i++)
			    {
			    	for(int j=0;j<col;j++)
			    	{
			    		sum += arr[i][j];
			    	}
			    }
			    double size = arr.length*arr[0].length;
			    double avarage = sum/size;
			    System.out.println("\n\nSum: "+sum);
			    System.out.println("Avarage: "+avarage);
			    input.close();
		  }

	}
