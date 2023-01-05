package firstdemo;
import java.util.Scanner;
public class main {
	
	class InvalidMarksException extends Exception{
	int marks;
	InvalidMarksException(int a){
	marks = a;
	}
	public String toString(){
	return "InvalidMarksException: "+marks;
	}
  }
}
