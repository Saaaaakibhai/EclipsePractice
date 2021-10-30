
package sva;

public class SvA {

    public static void main(String[] args) {
        // TODO code application logic here
    	int totalCost = 0;
		double tuition = 10000;
		double tuitionTenthYear = 0;

		for (int i = 1; i <= 14; i++) {
			// Increase tution by 5% every year
			tuition += (tuition * 0.05);  

			if (i > 10) 
				// Test for after 10 years
				totalCost += tuition; 
			if (i == 10)
				tuitionTenthYear = tuition; 
		}

		// Show the cost of tution in ten years
		System.out.println("Tuition in ten years: $" + tuitionTenthYear);

		// Show the cost of four years' worth of tuition after tenth year
		System.out.println("Total cost for four years' worth of tuition" +
			" after the tenth year: $" + totalCost);
    }
    
}
