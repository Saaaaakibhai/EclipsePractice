package firstdemo;

import java.util.Scanner;

public class MyExcepEx {
static void compute(int marks) throws InvalidMarksException {
if(marks >= 100 || marks <= 0)
throw new InvalidMarksException(marks);
else {
System.out.print("Marks obtained: "+marks+" Result: ");
if(marks>=50) System.out.println("Passed");
else System.out.println("Failed");
}
}
public static void main(String[] args) {
int i,marks;
Scanner inp = new Scanner(System.in);
for(i=0;i<5;i++){
marks = inp.nextInt();
try{
compute(marks);
}catch(InvalidMarksException e){
System.out.println("Exception Caught: "+e);
}
}
inp.close();
 }
}