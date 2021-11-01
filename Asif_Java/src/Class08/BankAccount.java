package Class08;

public class BankAccount {
//data field 
	String userName;
	int AccNo;
	double balance;
	//default constructor
	public BankAccount() {
		this.userName = "Not Updated";
		this.AccNo = -1;
		this.balance = 0;
	}
	//Argument Constructor 
	public BankAccount(String userName,int AccNo,double balance) {
		this.userName = userName;
		this.AccNo=AccNo;
		this.balance= balance;
	}
	//method
	public void AccountInfo() {
			System.out.println("User Name: "+userName);
			System.out.println("AC No: "+AccNo);
			System.out.println("Balance: "+balance);
		}
	}
	

