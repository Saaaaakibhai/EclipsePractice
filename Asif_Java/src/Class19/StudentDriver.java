package Class19;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		//Declaring a Student type ArrayList
		ArrayList<Student> list = new ArrayList<Student>();
		
		System.out.println("Enter the number of student: ");
		int n = in.nextInt();
		
		//getting students data from user
		for(int i=1;i<=n;i++) {
			System.out.println(""+i+".");
			System.out.print("Enter ID: ");
			int id = in.nextInt();
			in.nextLine();
			System.out.print("Enter Name: ");
			String name = in.nextLine();
			System.out.print("Enter cgpa: ");
			double cgpa = in.nextDouble();
			in.nextLine();
			list.add(new Student(id,name,cgpa)); 
		}
		
		//Sorting
		Collections.sort(list);
		
		/*
		//printing
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
		*/
		
		//write informations to file
		try {
			FileWriter w = new FileWriter("src/student.txt");
			//w.write("Hello World!");
			for(int i=0;i<list.size();i++) {
				w.write(list.get(i).toString());
				w.write("\n");
			}
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Read from file
		File file = new File("src/student.txt");
		try {
			Scanner input = new Scanner(file);
			while(input.hasNext()) {
				String data = input.nextLine();
				System.out.println(data);
			}
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}