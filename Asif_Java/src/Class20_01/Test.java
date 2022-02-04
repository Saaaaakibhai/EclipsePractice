package Class20_01;

public class Test<T> {
	T a;
	Test(){		
	}
	Test(T a){
		this.a = a ;
	}
	public T getA() {
		return a;
	}
	public void setA(T a) {
		this.a = a;
	}
}
