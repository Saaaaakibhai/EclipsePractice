package Class20_01;

public class Student <U,V>{
     U id;
     V cgpa;
     Student(){
    	 
     }
     Student(U id,V cgpa){
    	 this.id = id;
    	 this.cgpa = cgpa;
     }
	public U getId() {
		return id;
	}
	public V getCgpa() {
		return cgpa;
	}
	public void setId(U id) {
		this.id = id;
	}
	public void setCgpa(V cgpa) {
		this.cgpa = cgpa;
	}
     
     
}
