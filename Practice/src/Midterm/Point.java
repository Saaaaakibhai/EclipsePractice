package Midterm;

class Point {
	private int x;
	private int y;
    Point(int a,int b){
    	x=a;
    	y=b;
    }
	public void tricky(Point arg1) {
		this.x= arg1.x;
		this.y=arg1.y;

	}
public static void print(Point p) {
	System.out.println("("+p.x+","+p.y+")");
    }
}
