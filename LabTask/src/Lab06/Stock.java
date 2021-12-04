package Lab06;

public class Stock {
   String symbol;
   String name;
   double previousClosingPrice;
   double currentPrice;
   Stock(){
	   
}
   Stock(String symbol,String name){
	   this.symbol=symbol;
	   this.name=name;
}
public void setPreviousClosingPrice(double previousClosingPrice) {
	this.previousClosingPrice = previousClosingPrice;
}
public void setCurrentPrice(double currentPrice) {
	this.currentPrice = currentPrice;
}
public double getChangePercent() {
	return((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
}
    
}
