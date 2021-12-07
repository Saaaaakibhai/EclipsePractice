
public class MID {
	public static void main(String[]args) {
	int[][] array = {{1, 2}, {3, 4}, {4, 5}};

	int mul = 1;

	for(int i = 0; i < array.length; i++)

	    mul *= array[i][1];

	System.out.println(mul);
  }
}