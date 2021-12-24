package Class14;

public class Driver {
public static void main(String[] args) {
		
		Person[] arr = new Person[4]; //x = 4
		arr[0] = new Student("Ihsanul",21,203,3.77);
		arr[1] = new Student("Haque ",22,202,3.40);
		arr[2] = new Faculty("Dr. Bari",30,222,"BRI",10);
		arr[3] = new Faculty("Dr. Javed",40,333,"JVD",20);
		
		double CGPAsum = 0;
		double Salarysum = 0;
		int countSt = 0;
		int countFac = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Student) {
				System.out.println(arr[i].toString());
				CGPAsum += ((Student)arr[i]).getCGPA();
				countSt++;
			}else {
				System.out.println(arr[i].toString());
				Salarysum += ((Faculty)arr[i]).getSalary();
				countFac++;
			}
		}
		
		double avgCGPA = CGPAsum/(double)countSt;
		double avgSalary = Salarysum/(double)countFac;
		
		System.out.println("Average CGPA: "+avgCGPA);
		System.out.println("Average Salary: "+avgSalary);

	}

}
