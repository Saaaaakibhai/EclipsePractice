package Class07;
import java.util.Scanner;
public class Task09W3resource {

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        String ch1, ch2;
	        int charsPerLine;
	        //taking char
	        System.out.print("Give Two Charecter: ");
	        ch1 = input.next();
	        ch2 = input.next();
	        //taking lines
	        System.out.print("And how many chars per line: ");
	        charsPerLine = input.nextInt();
	        
	        printChars(ch1.charAt(0), ch2.charAt(0), charsPerLine);
	        input.close();
	    }

	    public static void printChars(char ch1, char ch2, int charsPerLine) {
	        int difference = (int)(ch2 - ch1);
	        for (int i = 0; i < difference; i++) {
	            System.out.print(++ch1 + " ");
	            if (ch1 == ch2)
	                break;
	            if (i % charsPerLine == 0)
	                System.out.print(++ch1 + "\n");
	      }
    }

}
