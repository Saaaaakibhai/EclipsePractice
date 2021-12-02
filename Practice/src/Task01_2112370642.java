import java.util.Scanner;
public class Task01_2112370642 {
              public static void main (String[]args) {
            	  int sum=0;
            	  float avarage;            	  
            	  Scanner input = new Scanner(System.in); //taking input user
            	     //take number of student as a row
            		  System.out.println("Enter number of student: ");
            		  int row = input.nextInt();
            		  //take classes as column 
                      System.out.println("Total Class: ");
                      int col = input.nextInt();
                      //Declaring 2D array
                      int [][]arr = new int [row][col];
            		  for(int i= 0;i<arr.length;i++) 
            		  {
            			  for(int j= 0;j<arr[0].length;j++) 
            			  {
            				  //show the position
            				  System.out.print("["+i+"]["+j+"]:");
            				  arr[i][j]= input.nextInt();                 				  
            			  }
            		  }
            		 //Showing output
					double total= classtotal(arr,row,col);
					System.out.println("Class Total: "+(int)total);
					System.out.println("Class Avarage: "+classaverage(total,col));     
}             
              public static double classtotal(int arr[][],int row,int col) {
            	      double sum = 0;
            	      //Calculate Sum
                      for(int i=0;i<row;i++) {
                    	  for(int j=0;j<col;j++) {
                    		  sum+=arr[i][j];
                    	  }
                    }
                      //Returning Sum
                      return sum;
              }
              public static double classaverage(double classtotal,int col) {
            	     //Calculate Average
            	     double classaverage = classtotal/col;
            	     return classaverage;
              }
}
