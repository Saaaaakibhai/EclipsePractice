package LabExam;

public class Account {
	private int accountNumber;
    private double balance;
    
    public Account() {
    	this.accountNumber=0;
    	this.balance=0.0;
    }

    public Account(int accountNumber, double balance) {
        this.accountNumber= accountNumber;
        this.balance= balance; 
    }
    public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void credit(double ammount) {
        // balance = balance + ammount;
        this.balance+= ammount;
        return;
    }
    public void debit(double ammount) {
        if(balance>= ammount)
            this.balance -= ammount;
        else
            System.out.println("Amount withdrawn exceeds the current balance!");
        return;
    }

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
    
}
