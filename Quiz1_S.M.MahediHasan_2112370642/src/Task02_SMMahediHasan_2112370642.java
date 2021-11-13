import java.util.Scanner;

public class Task02_SMMahediHasan_2112370642 {

	public static void main(String[] args) {
		//creating scanner object
		Scanner input =new Scanner(System.in);
		System.out.println("Enter Anything: ");
		//taking input
		char x = input.next().charAt(0);
		//capturing return true/false in in variable y 
		boolean y = isDigit(x);
		//output(boolean value)
		System.out.println(y);
		
	}
	public static boolean isDigit (char ch) {
		
		boolean a = Character.isDigit(ch);
		return a;		
		/*switch(ch)
		{
		case '0':return true;
		case'1':return true;
		case'2':return true;
		case'3':return true;
		case'4':return true;
		case'5':return true;
		case'6':return true;
		case'7':return true;
		case'8':return true;
		case'9':return true;
		default: return false;
		}		*/
	}
}
