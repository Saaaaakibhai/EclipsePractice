
public class BankB extends Bank{
	       public int year;
	       BankB(int year){
	    	 this.year=year;  
	       }
          @Override 
          public double getPercentage() {
			return 7.5;
          }
          @Override
          public double getInterest(){
        	  return 1500*getPercentage()*year;
          }
}