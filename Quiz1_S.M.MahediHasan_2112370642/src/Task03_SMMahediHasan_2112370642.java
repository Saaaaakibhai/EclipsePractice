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
		for (int rows = 1; rows <= lines; rows++) {
			for (int space = lines - rows; space >= 1; space--) {
				System.out.print("   ");
			}			
			//decreasing numbers in each row
			for (int i = rows; i >= 1; i--) {
					System.out.print(i*3+ " ");
			}
			
			System.out.print("1 ");
			//increasing numbers of each row
			for (int j = 1; j<= rows; j++) {
				System.out.print(j*3+ " ");
			}
			System.out.println();
		}

	}

}
