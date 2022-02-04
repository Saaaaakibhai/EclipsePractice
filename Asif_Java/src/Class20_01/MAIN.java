package Class20_01;

public class MAIN {
  public static void main(String[]args) {
	  Student <Integer,Double> obj = new Student <Integer,Double>();
	  obj.setId(201);
	  obj.setCgpa(5.5);
	  System.out.println(obj.getId());
	  System.out.println(obj.getCgpa());
  }
  
}
