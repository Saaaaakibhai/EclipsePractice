package FinalLab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Test {
      public static void main (String[]args) throws IOException, ClassNotFoundException {
    	  Scanner input = new Scanner(System.in);
    	  System.out.println("laptop price: ");
    	  double price2 = input.nextDouble();
    	  System.out.println("Smart Phone price: ");
    	  double price = input.nextDouble();
    	  System.out.println("Enter Phone Number: ");
    	  int phonenumber = input.nextInt();
    	  System.out.println("Enter Mail: ");
          String eMail = input.next();
    	  if(price>0 && price2>0){
    	         SmartPhone obj = new SmartPhone(phonenumber,price);
    	         Laptop obj2 = new Laptop (eMail,price2);
    	         FileOutputStream f = new FileOutputStream(new File("MyFile.txt"));
    	         ObjectOutputStream f2 = new ObjectOutputStream(f);
    	         f2.writeObject(obj);
    	         f2.writeObject(obj2);
    	         f.close();
    	         f2.close();
    	         FileInputStream x = new FileInputStream(new File("MyFile.txt"));
    	    	 ObjectInputStream x2 = new ObjectInputStream(x);
    	    	 SmartPhone SP = (SmartPhone) x2.readObject();
    	    	 Laptop LP = (Laptop) x2.readObject();
    	    	 x.close();
    	    	 x2.close();
    	    	System.out.println(SP.toString());
    	        System.out.println(LP.toString());
    	        if(price>price2) {
    	        	System.out.println("SmartPhone has highest price");
    	        }
    	        else if(price>price2){
    	        	System.out.println("Laptop has highest price");
    	        }
    	        else {
    	        	System.out.println("Both Are Same Price");
    	        }
    	  }else throw new IllegalArgumentException("Invalid Price");
    	
      }
}
