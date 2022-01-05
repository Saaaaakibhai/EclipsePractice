package Quiz3;

public class Pineapple implements Cookable {
	String HowtoTaste;
	Pineapple(String HowtoTaste){
		this.HowtoTaste="SourTaste";
	}
		@Override
		public void howToCook() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public String toString() {
			return "Pineapple [HowtoTaste=" + HowtoTaste + "]";
		}

        
}
