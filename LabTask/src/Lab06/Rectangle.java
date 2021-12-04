package Lab06;

public class Rectangle {
	   //data field
       double width =1;
       double height =1;
       //no arg constructor 
       Rectangle(){
    	   
       }
       Rectangle(double width,double height){
    	   this.width=width;
    	   this.height= height;
       }
       public double getArea() {
    	   return width*height;
       }
       public double getPerimeter() {
    	   return 2*(width+height);
       }
}
