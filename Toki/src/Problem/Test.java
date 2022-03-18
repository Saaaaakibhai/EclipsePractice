package Problem;

import java.util.Scanner;

public class Test extends Student {
	public static void main(String[] args) {
		Student s = new Student();

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter name1: ");
		String name1 = scan.nextLine();
		System.out.print("Enter Marks1: ");
		int marks1 = scan.nextInt();

		System.out.print("Enter name2: ");
		String name2 = scan.next();
		System.out.print("Enter Marks2: ");
		int marks2 = scan.nextInt();

		System.out.print("Enter name3: ");
		String name3 = scan.next();
		System.out.print("Enter Marks3: ");
		int marks3 = scan.nextInt();
		
		System.out.print("Enter name4: ");
		String name4 = scan.next();
		System.out.print("Enter Marks4: ");
		int marks4 = scan.nextInt();

		s.min(name1, name2, name3, marks1, marks2, marks3,name4,marks4);
		s.max(name1, name2, name3, marks1, marks2, marks3);
	}

}
