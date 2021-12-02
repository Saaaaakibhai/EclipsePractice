package Midterm;

public class PointDemo {
public static void main (String[]args) {
	Point pnt1= new Point(3,6);
	Point pnt2 = new Point(4,7);
	pnt1.tricky(pnt2);
	Point.print(pnt1);
	Point.print(pnt2);
    }
}
