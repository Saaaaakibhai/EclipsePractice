package Class20_01;

public class Driver {
     public static void main(String[]args) {
    	 Test<Integer> obj1 = new Test<Integer>();
    	 obj1.setA(5);
 		System.out.println(obj1.getA());
 		
 		Test <String> obj2 = new Test<String>();
 		obj2.setA("Java");
 		System.out.println(obj2.getA());
     }
}
