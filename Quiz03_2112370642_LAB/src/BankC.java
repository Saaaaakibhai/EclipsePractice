
public class BankC extends Bank{
	       public int year;
	       BankC(int year){
	    	 this.year=year;  
	       }
          @Override 
          public double getPercentage() {
			return 8;
          }
          @Override
          public double getInterest(){
        	  return 2000*getPercentage()*year;
          }
}