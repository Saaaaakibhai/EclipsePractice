import java.util.Scanner;
public class task {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);      
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        //taking the inner part as X
        double dis = b * b - 4.0 * a * c;
        if (dis > 0.0){
            double root1 = (-b+Math.pow(dis,0.5))/(2.0*a);
            double root2 = (-b-Math.pow(dis,0.5))/(2.0*a);
            System.out.println("Root1: " + root1 + "\nRoot2: " + root2);
        }
        else if (dis == 0.0){                
            double root1 = -b/(2.0 * a);
            System.out.println("Root: " + root1);
        }
        //minus into root 
        else {
            System.out.println("The equation has no real roots!");
        }      
        input.close();
    }
}
