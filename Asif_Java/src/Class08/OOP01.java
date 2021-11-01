package Class08;
//A class is a bundle of data field,constructors & methods
public class OOP01 {
	//data field 
	int a;
	double b;
	String s;
    //There are two types of constructors
	// no-argument constructor /default constructor

public OOP01(){
	
}
//Argument constructor 
public OOP01(int a,double b,String s) {
	this.a= a;
	this.b=b;
	this.s=s;
   }
//method 
public void printt() {
	System.out.println("a: "+a);
	System.out.println("b: "+b);
	System.out.println("s: "+s);
   }
}