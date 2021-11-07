package Class09;
import java.util.Scanner;
public class StudentController {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int n = input.nextInt();
		input.nextLine();
		//Creating a course array
		String courses[]= {"CSE115","CSE215","CSE225"};
		//Array of student
		Student s[]=new Student[n];
		//Getting all of the student info
		for(int i =0;i<n;i++) {
			System.out.println(""+(i+1)+".");
			System.out.print("Enter Name: ");
			String name = input.nextLine();
			System.out.print("Enter ID: ");
			int id = input.nextInt();
			input.nextLine();
			s[i] = new Student(name,id,courses);
		}
		//printing all the info
		for(int i=0;i<n;i++) {
			s[i].showStudentInfo();
		}
		
		input.close();
	}
}
