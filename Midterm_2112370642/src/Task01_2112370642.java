import java.util.Scanner;

public class Task01_2112370642 {		  
		// Function to find the sum of series
public static void main(String[]args){
		{
			Scanner input = new Scanner(System.in);
		    double sum = 0;
		    System.out.println("Enter N: ");
		    int N = input.nextInt();
			for(int i=1;i<=N;i++)
			{
				sum=sum+(i/i+1);
				
			}		
			System.out.println("sum : "+sum);
		}
      }
}
