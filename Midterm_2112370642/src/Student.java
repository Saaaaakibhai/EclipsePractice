
public class Student {
  private String name;
  private int ID;
  private int marks;
  private String status;
  public final int JUNIOR=1;
  public final int SOPHOMORE=2;
  public final int SENIOR=3;
  Student(){
	  this.name=null;
	  this.ID=1;
	  this.marks=0;
	  this.status = "JUNIOR";
  }
Student(String name, int ID) {
	this.name = name;
	this.ID = ID;
}
public Student(String name, int ID, int marks, String status) {
	super();
	this.name = name;
	this.ID = ID;
	this.marks = marks;
	this.status = status;
}
public String getName() {
	return name;
}
public int getID() {
	return ID;
}
public int getMarks() {
	return marks;
}
public String getStatus() {
	return status;
}
public int getJUNIOR() {
	return JUNIOR;
}
public int getSOPHOMORE() {
	return SOPHOMORE;
}
public int getSENIOR() {
	return SENIOR;
} 
public void addMarks(int marks) {
	this.marks = marks;
  }
public String toString() {
	return "Name"+name+"ID"+ID+"Marks"+marks+"Status"+status;
}
}

