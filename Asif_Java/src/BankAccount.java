public class BankAccount {
        private String name;
        private int accno;
        private int pin;
        private double balance;
        private String address;
        
        BankAccount(){
        	
        }
        BankAccount(String name,int accno,String address){
        	this.name = name;
        	this.accno = accno;
        	this.address = address;
        }
        BankAccount(String name,int accno,int pin,double balance,String address){
        	this.name = name;
        	this.accno= accno;
        	this.pin = pin;
        	this.balance = balance;
        	this.address = address;
        }
		public String getName() {
			return name;
		}
		public int getAccno() {
			return accno;
		}
		public int getPin() {
			return pin;
		}
		public double getBalance() {
			return balance;
		}
		public String getAddress() {
			return address;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAccno(int accno) {
			this.accno = accno;
		}
		public void setPin(int pin) {
			this.pin = pin;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public void setAddress(String address) {
			this.address = address;
		}
        public void withdraw(double amount) {
        	this.balance = balance-amount;
        }
        public void deposit(double amount) {
        	this.balance = balance+amount;
        }
        public double checkBalance(int key) {
        	if(this.pin==key) {
        		return balance;
        	}
        	else{
        		System.out.println("Wrong PIN.");
        	}
			return 0.0;        	
        }
        public String toString() {
        	return name+" " +" "+accno+" "+" "+address+" "+" "+ balance+" "+pin;
        }
}

