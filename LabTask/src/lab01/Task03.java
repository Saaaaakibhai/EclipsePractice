package Lab01;
/*
 * Task – 3
(Area and perimeter of a circle) Write a program that displays the area and 
perimeter of a circle that has a radius of 5.5 using the following formula:
perimeter = 2 * radius * pi
area = radius * radius * pi
*/

public class Task03 {
            public static void main(String[]args) {
            	double radius = 5.5;
            	double perimeter = 2*radius* Math.PI;
            	double area = Math.pow(radius, 2)*Math.PI;
            	System.out.printf("Perimeter: %.2f\n",perimeter);
            	System.out.printf("Area: %.2f",area);
            }
}
