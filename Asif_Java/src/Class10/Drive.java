package Class10;
public class Drive {
public static void main(String[]args) {
	BankAccount obj = new BankAccount();
	obj.setName("Sakib");
	obj.setPIN(50);
	obj.setACNO(211);
	obj.setBalance(1000);
	
   System.out.println("Name: "+obj.getName());
   System.out.println("ACNO: "+obj.getACNO());
   System.out.println("PIN: "+obj.getPIN());
   System.out.println("Balance: "+obj.getBalance());
   
   BankAccount obj1 = new BankAccount("Sakib",505,4, 162.2);
   System.out.println(obj1.getInfo());
   BankAccount obj2 = new BankAccount("Hasan",202,3, 652.32);
   System.out.println(obj2.getInfo());
   
   
}
}
