
public class BankA extends Bank{
	       public int year;
	       BankA(int year){
	    	 this.year=year;  
	       }
          @Override 
          public double getPercentage() {
			return 7;
          }
          @Override
          public double getInterest(){
        	  return 1000*getPercentage()*year;
          }
}
