import java.util.Scanner;

// create class 
// psvm
// scanner input
// taking name with variable name 
// taking ID with variable cgpa
// taking cgpa with variable id 
// print name,id,cgpa 
// input close 

public class Inputtesting{
	
  public static void main(String[]args) {
	// Access Specifier //Method // Return type // Array with String   
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter you name: ");
	  String name = input.nextLine();
	  
	  System.out.print("Enter a ID: ");
	  int cgpa = input.nextInt();
	  
	  System.out.print("Enter your cgpa: ");
	  double id = input.nextDouble();
	  
	  System.out.println();
	  
	  //data type // variable 
	  
	  System.out.println("My name is: "+name);
	  System.out.println("My id is: "+id);
	  System.out.println("This is my cgpa: "+cgpa);
	  
	  input.close();
  }
}
