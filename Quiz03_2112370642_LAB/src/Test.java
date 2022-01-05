
public class Test {
public static void main(String[]arg) {
	  BankA x = new BankA(3);
	  BankB y = new BankB(3);
	  BankC z = new BankC(3);
      double [] a = { x.getInterest(),y.getInterest(),z.getInterest() };
	  for(double i:a) {
		  System.out.println(i);
	  }
	   
 } 
}
