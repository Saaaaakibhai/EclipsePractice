import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		//Scanner class
		Scanner input = new Scanner(System.in);
		
		//getting array size from user
		System.out.print("Enter array size: ");
		int size = input.nextInt();
		
		//Array declaration
		int arr[] = new int[size];
		
		//getting elements from user index by index
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr["+i+"]: ");
			arr[i] = input.nextInt();
		}
		
		//printing
		System.out.print("Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		
		input.close();

	}
}
