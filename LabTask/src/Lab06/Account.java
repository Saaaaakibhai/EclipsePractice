package Lab06;

import java.util.Date;

public class Account {
        private int id;
        private double balance;
        private double annualInterestRate;
        private Date dataCreated;
        Account(){
        	this.id= 0;
        	this.balance= 0.0;
        	this.annualInterestRate=0.0;
        	this.dataCreated = new Date();
        }
        Account(int id,double balance){
        	this.id=id;
        	this.balance=balance;
        }
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public double getAnnualInterestRate() {
			return annualInterestRate;
		}
		public void setAnnualInterestRate(double annualInterestRate) {
			this.annualInterestRate = annualInterestRate;
		}
		public Date getDataCreated() {
			return dataCreated = new Date();
		}
		public double getMonthlyInterestRate() {
			return (annualInterestRate/100)/12;
		}
        public double getMonthlyInterest() {
        	return balance*getMonthlyInterestRate();
        }
        public void withdraw(double amount) {
        	this.balance -=amount;
        }
        public void deposit(double amount) {
        	this.balance+=amount;
        }
}
