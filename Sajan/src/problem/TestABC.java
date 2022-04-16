package problem;

public class TestABC {
	public static void main(String[]args) {
		double a = 20; 
		double  b =50; 
		double c = 10; 
		double m=(a - b + c);
		System.out.println(textABCValid(m)); 
	}
	      public static boolean textABCValid(double m) {
	    	  if(m<=0) {
	    		  return false;
	    	  }
	    	  else 
	    	  {
	    		  return true;
	    	  }
	      }
}
	
	
	
