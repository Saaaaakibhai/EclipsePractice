import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		
		//java switch
		//syntex 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		switch(n%2) {
		
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		default:
		    System.out.println("Odd");
		
		}
		System.out.println("");
	}

}
