package Class12_02;
public class Faculty extends Person{
	private int fID;
	private String dept;
	
	Faculty() {

	}

	Faculty(String name, int age, String address, int fID, String dept) {
		super(name, age, address);
		this.fID = fID;
		this.dept = dept;
	}

	public int getfID() {
		return fID;
	}

	public String getDept() {
		return dept;
	}

	public void setfID(int fID) {
		this.fID = fID;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Faculty Name: " + this.getName() + "\nAge: " + this.getAge() + "\nAddress: " + this.getAddress()
				+ "\nID: " + this.getfID() + "\nDept.: " + this.getDept() + "\n";
	}
	
	

}
