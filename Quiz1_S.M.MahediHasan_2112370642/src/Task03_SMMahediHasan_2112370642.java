import java.util.Scanner;

public class Task03_SMMahediHasan_2112370642 {

	public static void main(String[] args) {
		// taking input from user
		
		Scanner input = new Scanner(System.in);
		
		//Enter line from 1 to 15 for displaying pyramid
		
		System.out.print("Enter the number of lines: ");
		int lines = input.nextInt();
		
		// Display pyramid
		//r=rows s=space 
		
		for (int r = 1; r <= lines; r++) {
			for (int s = lines - r; s >= 1; s--) {
				System.out.print("  ");
			}
			// decreasing numbers in each row
			for (int i = r; i >= 2; i--) {
				System.out.print(i + " ");
			}
			// increasing numbers of each row
			for (int j = 1; j<= r; j=j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
