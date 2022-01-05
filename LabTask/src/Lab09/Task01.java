package Lab09;
import java.util.ArrayList;

/********Task – 1
(Use ArrayList) Write a program that creates an ArrayList and adds a Loan object, 
a Date object, a string, and a Circle object to the list, and use a loop to display all 
the elements in the list by invoking the object’s toString() method.*****/


public class Task01 {
	public static void main(String[] args) {

        ArrayList<Object> obj = new ArrayList<>();

        obj.add(new Loan(5000,10));
        obj.add(new MyDate());
        obj.add("S. M. Mahedi Hasan");
        obj.add(new Circle(5.0));

        for (int i = 0; i < obj.size(); i++) {
            System.out.println(obj.get(i).toString());
        }
    }

}
