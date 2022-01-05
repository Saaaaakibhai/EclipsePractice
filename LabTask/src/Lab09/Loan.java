package Lab09;
import java.util.Date;
public class Loan {
	 private double balance;
	    private double annualInterest;
	    private Date dateCreated;

	    public Loan(double balance, double annualInterest) {
	        this.balance = balance;
	        this.annualInterest = annualInterest;
	        this.dateCreated = new Date();
	    }

	    public boolean withdraw(double withdraw) {
	        if (balance < withdraw) {
	            return false;
	        }

	        balance -= withdraw;
	        return true;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public double getAnnualInterest() {
	        return annualInterest;
	    }

	    public void setAnnualInterest(double annualInterest) {
	        this.annualInterest = annualInterest;
	    }

	    public Date getDateCreated() {
	        return dateCreated;
	    }

	    @Override
	    public String toString() {
	        return "Loan{" +"balance=" + balance +", annualInterest=" + annualInterest +
	                ", dateCreated=" + dateCreated +
	                '}';
	    }
}
