package Quiz3;

public class Pear implements Cookable{
	String HowtoTaste;
	
   Pear(String HowtoTaste){
	   this.HowtoTaste="Sweet Taste";
   }
	@Override
	public void howToCook() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Pear [HowtoTaste=" + HowtoTaste + "]";
	}
      
}
