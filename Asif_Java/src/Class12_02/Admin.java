package Class12_02;
public class Admin {

	public static void main(String[] args) {
		Student s1 = new Student("Ihsanul Haque",21,"Khilgaon-Dhaka",201,3.77);
		Student s2 = new Student("Aminul Islam",23,"dfdfd Dhaka",202,3.55);
		
		Faculty f1 = new Faculty("Dr. Mohammad",3434,"Dhanmondi-Dhaka",222,"ECE");
		Faculty f2 = new Faculty("Dr. Azim",343,"Bashundhara-Dhaka",333,"ECE");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(f1.toString());
		System.out.println(f2.toString());

	}

}
