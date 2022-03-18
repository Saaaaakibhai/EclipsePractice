package problem;

import java.util.Scanner;

public class task {
	public static void main(String[] args) {
		int id = 0, sec = 0, N=3;
		float cgpa = 0;
		double sum=0, avg=0;
		Scanner input= new Scanner(System.in);
		String name = null, code = null;	
		System.out.println("Enter how many information you wanna gather: ");
        N = input.nextInt();
        double arr[] = new double [N];
        String[] strarray = new String[N];
		for(int i=0; i<arr.length;i++) {
			System.out.println("Enter "+i+" no of Student info: ");
			
			System.out.println("Enter Full Name: ");
			strarray[i]=input.next();		
			input.nextLine();
			System.out.print("Enter ID: ");
			arr[i]= input.nextDouble();
			System.out.print("Enter Section : ");
			arr[i]= input.nextDouble();
			System.out.print("Enter CGPA: ");
			 arr[i]= input.nextDouble();
			System.out.print("Enter Course code: ");
			arr[i]= input.nextDouble();
			System.out.println("");
			
			sum += arr[i];
		}
		
		for(int i=0;i<arr.length; i++) {
			System.out.println("The info of "+i+" Student is: ");
			System.out.println("");
			
			System.out.println("Student's Full Name is: "+arr[i]);
			System.out.println("Student's ID is: "+arr[i]);
			System.out.println("Student's Section is: "+arr[i]);
			System.out.println("Student's CGPA is: "+arr[i]);
			System.out.println("Student's Course Code is: "+arr[i]);
		}
		System.out.println("The sum of CGPA is: "+sum);
		avg= sum/N;
		System.out.println("The average of "+N+" Student's CGPA is: "+avg);
		
	}
}
