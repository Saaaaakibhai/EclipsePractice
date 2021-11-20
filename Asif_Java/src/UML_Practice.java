public class UML_Practice {

	public static void main(String[] args) {
	    BankAccount obj = new BankAccount("Mahadi",211,7528,5000.00,"ka-37");
        //obj.BankAccount(5000);
	    System.out.println(obj.toString());
	    System.out.println(obj.checkBalance(7528));
	}
}
