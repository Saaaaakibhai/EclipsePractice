package Class07;

import java.util.Scanner;

public class Task01 {
        public static void main (String[]args) {
        	Scanner input = new Scanner(System.in);
        	System.out.println("Enter N: ");
        	int n = input.nextInt();
        	
        	for(int i=2;i<=n;i++) {
        		if(isPerfect(i)==1)
        			System.out.print(i+" ");
        	}
        	input.close();
        }
        public static int isPerfect(int n) {
        	int sum = 0;
        	for (int i=1;i<n;i++) {
        		if(n%i==0)
        			sum+=i;
        	}
        	if(sum==n)
        		return 1;
        	else 
        		return 0;
        }
}
