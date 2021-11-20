package Inheritance;

public class FullTimeEmployee extends Employee {
          private double basic;
          private double allowance; 
	FullTimeEmployee(String name, int age, String address, String department, String designation,double basic,double allowance) {
		super(name, age, address, department, designation);
		this.basic= basic;
		this.allowance= allowance;
	}
	public double getBasic() {
		return basic;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	public double salary() {
            double aw=(basic*allowance)/100;
            return aw+basic;
	}
	public String toString() {
		return "Basic:"+basic+"Allowance: "+allowance;
	}
}
