package Class14;

public class Faculty extends Person {
	int ID;
	String initial;
	double salary;
	
	Faculty(){
		
	}
	
	Faculty(String name,int age,int ID,String initial,double salary){
		super(name,age);
		this.ID = ID;
		this.initial = initial;
		this.salary = salary;
	}

	public int getID() {
		return ID;
	}

	public String getInitial() {
		return initial;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}
	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Faculty -> "+"Name: "+this.getName()+"; Age: "+this.getAge()+"; ID: "+this.getID()+"; Initial: "+this.getInitial()+"; Salary: "+this.getSalary();
	}
}
