import java.util.Scanner;

public class Quiz1 {
     public static void main(String []args)
     {
    	 Scanner input = new Scanner(System.in);
    	 System.out.println("Enter n: ");
    	 int n = input.nextInt();
    	 int sum=0;
    	 for(int i=0;i<=n;i++) {
    		 sum+=Math.pow(-1,i)*Math.pow(2,i);
    	 }
    	 System.out.println("Sum: "+sum);
     }
}
