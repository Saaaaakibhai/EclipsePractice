package Task01;
import java.util.Scanner;

	public class Task01 {
	    public static void main(String[] args){
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("Enter N : ");
	        int n = input.nextInt();
	        
	        System.out.println("Enter A : ");
	        int a = input.nextInt();
	        
	        double sum = 1;
	        int j = 1;
	        
	        for(int i = 1;i <= n;i++){
	            sum = sum + (j/Math.pow(a,i));
	            j = j + 2;
	        }
	        System.out.println(sum);
	    }
	}

