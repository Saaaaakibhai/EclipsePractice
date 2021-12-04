package Lab05;
import java.util.Scanner;
public class Task01 {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 10 integer: ");
    int [] n = new int[5];
    for(int i=0;i<n.length;i++)
    {
    	n[i]=input.nextInt();   	
    }
    for(int i = n.length -1;i>=0;i--) {
		System.out.println(n[i]+"");
	}
 }
}
