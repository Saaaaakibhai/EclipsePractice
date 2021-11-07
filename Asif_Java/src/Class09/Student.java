package Class09;

import java.util.Arrays;

public class Student {
            String name;
            int id;
            String courses[];
            Student(){
            	
            }
            Student(String name,int id,String course[]){
            	this.name=name;
            	this.id = id;
            	this.courses = course;            	
            }
            public void showStudentInfo() {
            	System.out.println("Name: "+name);
            	System.out.println("ID: "+id);
            	System.out.println("Courses: "+Arrays.toString(courses));
            	System.out.println();
            }
}
