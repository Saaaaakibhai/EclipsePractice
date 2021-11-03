package ThirdClass;
import java.util.Scanner;

public class QuizLab1 {
	// psvm
	public static void main(String[] args) {
		//calling input from user
		Scanner input = new Scanner(System.in); 

		// taking input/sides of triangle 
		System.out.print("Enter three sides for a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		// ternary operator
		System.out.println(isValid(side1, side2, side3) ? "The area of the triangle is " + area(side1, side2, side3) :"Input is invalid");
		
	}
	public static boolean isValid(double side1, double side2, double side3) 
	{
		//judging the side of triangle according to the boolean 
		boolean valid =side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
		return valid;
	}
	//passing area to the main method
	public static double area(
		double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;	
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
}