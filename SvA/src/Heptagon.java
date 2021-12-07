public class Heptagon {
	//Data field 
	private double side;
    public static int numOfHeptagon;
    //Constructor 
    Heptagon(){
        numOfHeptagon++;
    }

    Heptagon(double side){
        this.side = side;
        numOfHeptagon++;
    }
    //getter setter method
    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    //getting area
    public double getArea(){
        return 3.634 * Math.pow(side,2); // 7/4 * cot(180/7) == 3.634
    }
   //getting Perimeter
    public double getPerimeter(){
        return 7 * side;
    }

    @Override
    public String toString() {
        return "Object Count : " + numOfHeptagon;
    }
}
