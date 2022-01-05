package FinalLab;

abstract public class MyDrive {
          private String networks;
          private double price;
          MyDrive(){
        	  
          }
          MyDrive(String networks,double price){
        	  this.networks= networks;
        	  this.price=price;
          }
		public String getNetworks() {
			return networks;
		}
		public double getPrice() {
			return price;
		}
		public void setNetworks(String networks) {
			this.networks = networks;
		}
		public void setPrice(double price) {
			this.price = price;
		}
        abstract  public  void portable();
        
        	
}
