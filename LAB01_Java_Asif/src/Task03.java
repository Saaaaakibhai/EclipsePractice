import java.util.*;

public class Task03 {
        public static void main (String[]args)
        {
        	Scanner input = new Scanner(System.in);
        	double v = input.nextDouble();
        	double  a = input.nextDouble();
        	double valocity= v*v;
        	double acc = 2*a;
        	System.out.printf("%.3f",valocity/acc); input.close();
        }
        
}
