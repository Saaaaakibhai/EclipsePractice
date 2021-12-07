package Lab06;

public class Task03 {
	public static void main(String[]args) {
         Account ac = new Account(1122,20000);
         ac.setAnnualInterestRate(4.5);
         ac.withdraw(2500.0);
         ac.deposit(3000.0);
         System.out.println("Balance: "+ac.getBalance()+
        		 ",Monthly Interest: "+ac.getMonthlyInterest()+
        		                     ",Date: "+ac.getDataCreated());
	}
}
