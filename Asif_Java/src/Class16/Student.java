package Class16;

public class Student extends Person implements StudentID {
	double cgpa;
	int ID;
	
	Student(){
		
	}
	
	Student(String name,int age,double cgpa,int ID){
		super(name,age);
		this.cgpa = cgpa;
		this.ID = ID;
	}
	
	@Override
	public void printID() {
		System.out.println("ID: "+ID);
		
	}

}
