package Lab02;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int day = input.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();
        int up_day=(day+elapsed)%7;
        String n_day = " ";
        switch(day)
        {            
            case 0:
                n_day= "sunday";
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
            	System.out.println("Invalid");
	}
        if (up_day==0) {
        	System.out.printf("Today is %s and the future day is Thursday",up_day);
        }
        else if (up_day==1) {
        	System.out.printf("Today is %s and the future day is Thursday",up_day);
        }
        else if (up_day==2) {
        	System.out.printf("Today is %s and the future day is Thursday",up_day);
        }
        else if (up_day==3) {
        	System.out.printf("Today is %s and the future day is Thursday",up_day);
        }
        else if (up_day==4) {
        	System.out.printf("Today is %s and the future day is Thursday",up_day);
        }
        else if (up_day==5) {
        	System.out.printf("Today is %s and the future day is Thursday",up_day);
        }
        else if (up_day == 6) {
        	System.out.printf("Today is %s and the future day is Thursday",up_day);
        }
        
  }
	
}
