package Lab10;

import java.util.Scanner;

public class Task03 {
         public static void main(String[]args) {
        	 Scanner input = new Scanner(System.in);
        	 GeometricObject[] geometricObject = new GeometricObject[2];
        	 for(int i=0;i<geometricObject.length;i++) {
        		 System.out.println("Enter the side of the Square:");
        		 
        		 geometricObject[i] = new Square(input.nextDouble());
        		 System.out.println("Area of square "+(i+1)+" is "+geometricObject[i].getArea());
        		 System.out.println("Perimeter of square "+geometricObject[i].getPerimeter());
        		 ((Square)geometricObject[i]).howToColor();
        		 System.out.println();
        		 
        	 }
          }
}
