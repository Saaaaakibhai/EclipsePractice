package Inheritance;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter N: ");
		int N = input.nextInt();
	    FullTimeEmployee[] arr = new FullTimeEmployee[N];
	    for(int i=0;i<arr.length;i++) {
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Enter age: " );
        int age = input.nextInt();
        System.out.println("Enter Address: ");
        String address = input.next();   
        System.out.println("Enter Department: ");
        String department = input.next();
        System.out.println("Enter Desingnation: ");
        String designation = input.next();
        System.out.println("Basic: " );//Salary
        double basic= input.nextDouble();
        System.out.println("Allowance: " );
        double allowance= input.nextDouble();
        arr[i]= new FullTimeEmployee(name,age,address,department,designation,basic,allowance);
	    }
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println(arr[i].salary());
	    }
	    
	    
	    
	    
	    PartTimeEmployee[] arr1 = new PartTimeEmployee[N];
	    for(int i=0;i<arr1.length;i++) {
        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Enter age: " );
        int age = input.nextInt();
        System.out.println("Enter Address: ");
        String address = input.next();   
        System.out.println("Enter Department: ");
        String department = input.next();
        System.out.println("Enter Desingnation: ");
        String designation = input.next();
        System.out.println("Hours: ");
        double hours = input.nextDouble();
        System.out.println("Rate: ");
        double rate = input.nextDouble();
        System.out.println("Basic: " );//Salary
        double basic= input.nextDouble();
        System.out.println("Allowance: " );
        double allowance= input.nextDouble();
        arr1[i]= new PartTimeEmployee(name,age,address,department,designation,hours,rate);
	    }
	    for(int i=0;i<arr1.length;i++) {
	    	System.out.println(arr1[i].salary());
	    }
	}

}
