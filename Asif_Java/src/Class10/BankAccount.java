package Class10;

public class BankAccount {
//Data Fields
	private String name;
	private int ACNO;
	private int PIN;
	private double Balance;
	//Default Constructor
    BankAccount(){
    	
    }
    //Constructor
    BankAccount(String name,int ACNO,int PIN,double Balance)
    {
    	//This is an overloaded constructor
    	this.name = name;
    	this.ACNO = ACNO;
    	this.PIN = PIN;
    	this.Balance = Balance;
    	
    }
    public String getInfo() {
    	return "Name: "+name+"; AC No: "+ACNO+"; PIN: "+PIN+";Balace: "+Balance+"\n";
    }
	public String getName() {
		return name;
	}
	public int getACNO() {
		return ACNO;
	}
	public int getPIN() {
		return PIN;
	}
	public double getBalance() {
		return Balance;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setACNO(int aCNO) {
		ACNO = aCNO;
	}
	public void setPIN(int pIN) {
		PIN = pIN;
	}
	public void setBalance(double balance) {
		this.Balance = balance;
	}
    
    
}
