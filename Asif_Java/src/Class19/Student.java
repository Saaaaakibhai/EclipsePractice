package Class19;

public class Student implements Comparable<Student>{
	int id;
	String name;
	double cgpa;

	
	Student(int id,String name,double cgpa){
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	
	public String toString() {
		return "ID: "+this.id+"; Name: "+this.name+"; CGPA: "+this.cgpa;
	}

	@Override
	public int compareTo(Student obj) {
		if(this.cgpa > obj.cgpa)
			return 1;
		else if(this.cgpa < obj.cgpa)
			return -1;
		else return 0;
	}

}