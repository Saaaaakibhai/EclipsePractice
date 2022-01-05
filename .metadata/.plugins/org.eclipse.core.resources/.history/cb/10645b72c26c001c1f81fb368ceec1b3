package Class17;

import java.util.Arrays;

public class Student implements Comparable<Student>,Cloneable{
	int id;
	String name;
	double cgpa;
	double[] marks; //object type
	
	Student(int id,String name,double cgpa){
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	Student(int id,String name,double cgpa,double[] marks){
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		this.marks = marks;
	}
	
	public String toString() {
		return "ID: "+this.id+"; Name: "+this.name+"; CGPA: "+this.cgpa+"; Marks: "+Arrays.toString(marks);
	}

	@Override
	public int compareTo(Student obj) {
		if(this.cgpa > obj.cgpa)
			return 1;
		else if(this.cgpa < obj.cgpa)
			return -1;
		else return 0;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		//return (Student)super.clone(); //Shallow copy
		
		//Deep copy
		Student temp = (Student)super.clone();
		double[] temparr = new double[this.marks.length];
		
		for(int i=0;i<temparr.length;i++) {
			temparr[i] = this.marks[i];
		}
		
		temp.marks = temparr;
		return temp;
	}

      }

