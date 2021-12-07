package Lab06;

public class Task02 {
public static void main(String[]args) {
	Stock stock = new Stock("ORCL","Oracle Corporation,");
	stock.setPreviousClosingPrice(34.5);
	stock.setCurrentPrice(34.35);
	// %% for use sign 
	System.out.printf("price-change percentage = %.2f%%",stock.getChangePercent());
    }
}
