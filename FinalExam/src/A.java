
public class Main {
     public static void main(String[] args){
      B b = new B(10);
   }  
}

class A {
    int x;
   public A(int x) {
       this.x = x;
   }
}

class B extends A {
   public B(int y) {
       super(y);
   }
}