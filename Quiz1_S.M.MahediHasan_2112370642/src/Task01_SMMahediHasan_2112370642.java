import java.util.Scanner;

public class Task01_SMMahediHasan_2112370642 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		System.out.print("Enter the number of sides: ");
		//n=number of sides
		double n = input.nextInt();
		// getting area of polygon		
		double area = (n * Math.pow(side, 2) / 
			(4 * Math.tan(Math.PI / n)));
		// Area
		System.out.println("The area of the polygon is " + area);
	    }
}
