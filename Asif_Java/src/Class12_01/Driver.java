package Class12_01;

class A{
	int a;
	int b;
	A(int a,int b){
		this.a=a;
		this.b=b;
		//no line to execute
	}
}
class B extends A{
	int c;
	//a,b
	B(int a, int b, int c){
		super(a,b);
		this.c=c;
	}
	public void print() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
public class Driver {
	public static void main(String[] args) {
              B obj = new B(1,2,3);
              obj.print();
	}
}
