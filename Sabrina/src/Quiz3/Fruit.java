package Quiz3;

public abstract class Fruit {
      private String fruitname;
      private String color;
      Fruit(){
    	  
      }
      Fruit(String color,String fruitname){
    	  this.color=color;
    	  this.fruitname=fruitname;
      }
	public String getFruitname() {
		return fruitname;
	}
	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
      public abstract void taste();
}
