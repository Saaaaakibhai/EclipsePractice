import java.sql.Array;
import java.util.Scanner;
public class testStudent {
	public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter 5th digit: ");// 2112370642
			int n = input.nextInt(); // 2112370642
			input.nextLine();
			// Creating a array
			// Array of student
			Student s[] = new Student[n];

			// Getting all of the student info
			for (int i = 0; i < n; i++) {
				System.out.println("" + (i + 1) + ".");
				System.out.print("Enter Name: ");
				String name = input.nextLine();
				System.out.print("Enter Marks: ");
				int marks = input.nextInt();
				input.nextLine();
				s[i] = new Student(name, marks);
			}
			// printing all the info
			for (int i = 0; i < n; i++) {
				s[i].toString();
			}
			Student stdobject = null;
			int max = 0;

			for (int i = 0; i<s.length; i++)
				
			{
				if (s[i].getMarks() > max) {
					max = s[i].getMarks();
					stdobject = s[i];
				}
			}
			
			System.out.println("Highest Mark obtainer details :  ");
			System.out.println(stdobject.getMarks());
	}
}
	

