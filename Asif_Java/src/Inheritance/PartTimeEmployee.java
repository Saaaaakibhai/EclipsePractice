package Inheritance;

public class PartTimeEmployee extends Employee{

	private double hours;
	private double rate;
	PartTimeEmployee(String name, int age, String address, String department, String designation,double hours,double rate) {
		super(name, age, address, department, designation);
		this.hours=hours;
		this.rate=rate;
	}
	public double getHours() {
		return hours;
	}
	public double getRate() {
		return rate;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double salary(){
		return hours*rate;
	}
	@Override
     public String toString() {
		return "hours: "+hours+"rate: "+rate;
	}
}
