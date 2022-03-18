package LabExam;

import java.util.Scanner;

public class lottery {
	public static void main(String[]args) {
		int count=0;
		Scanner input = new Scanner(System.in);
		   System.out.println("Enter first term: ");
	       String m = input.nextLine();
	       System.out.println("Enter the second term: ");
	       String n = input.nextLine();
	       for(int i=0;i<m.length();i++) {
	    	   if(count==m.length())
	    		   break;
	    	   if(n.charAt(count)==m.charAt(i)) {
		    	   count++;
		       }
	    	   else {
	    		   if(count>0) {
	    			   i-=count;
	    		   }
	    		   count=0;
	    	   }
	       }
	       
	       if(count != -1) {
	    	   System.out.print("Winner");
	       }else {
	    	   System.out.println("Loser");
	       }
	}       
}
