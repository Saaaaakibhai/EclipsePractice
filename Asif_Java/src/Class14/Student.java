package Class14;

public class Student extends Person{
	private int ID;
	private double CGPA;
	
	Student(){
		
	}
	
	Student(String name,int age,int ID,double CGPA){
		super(name,age);
		this.ID = ID;
		this.CGPA = CGPA;
	}

	public int getID() {
		return ID;
	}

	public double getCGPA() {
		return CGPA;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setCGPA(double cGPA) {
		CGPA = cGPA;
	}
	
	public String toString() {
		return "Student -> "+"Name: "+this.getName()+"; Age: "+this.getAge()+"; ID: "+this.getID()+"; CGPA: "+this.getID();
	}
}
