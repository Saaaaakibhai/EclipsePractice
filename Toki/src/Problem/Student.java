package Problem;

public class Student {
public void min(String n1, String n2, String n3, int m1, int m2, int m3,String n4,int m4) {
		
		System.out.println("Minimum ");
		if (m1 < m2) {
			System.out.println("Name:" + n1);
			System.out.println("Marks: " + m1);
		}
		 else if (m1 < m3) {
				System.out.println("Name:" + n1);
				System.out.println("Marks: " + m1);
		 }
				else if(m1<m4) {
					System.out.println("Name:" + n1);
					System.out.println("Marks: " + m1);
				}
				else if (m2<m1) {
					System.out.println("Name:" + n2);
					System.out.println("Marks: " + m2);
				}
			 else if (m2 < m3) {
					System.out.println("Name:" + n2);
					System.out.println("Marks: " + m2);
			 }
					else if(m2<m4) {
						System.out.println("Name:" + n2);
						System.out.println("Marks: " + m2);
					}
				 else if (m3<m1) {
					System.out.println("Name:" + n3);
					System.out.println("Marks: " + m3);
					
				}
				else if(m3<m2) {
					System.out.println("Name:" + n3);
					System.out.println("Marks: " + m3);
				}
				else if(m<m1) {
					
				}
				else if
				else {
					System.out.println("Name:" + n4);
					System.out.println("Marks: " + m4);
				}
			System.out.println();
			}
		

	

	public void max(String n1, String n2, String n3, int m1, int m2, int m3) {
		System.out.println("Maximum");
		if (m1 > m2) {
			System.out.println("Name:" + n1);
			System.out.println("Marks: " + m1);
		} else {
			if (m1 > m3) {
				System.out.println("Name:" + n1);
				System.out.println("Marks: " + m1);
			} else {
				if (m2 > m3) {
					System.out.println("Name:" + n2);
					System.out.println("Marks: " + m2);
				} else {
					System.out.println("Name:" + n3);
					System.out.println("Marks: " + m3);
				}
			}
		}
		System.out.println();
	}
}
