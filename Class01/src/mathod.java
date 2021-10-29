
public class mathod {
                   public static void main(String[]args)
                   {
                	   //relation== static+static
                	   //relation==non-static+non-static
                	   int a = 10;
                	   int b = 20;
                       //int ans = sum(a,b);
                	   System.out.println("Sum is: "+sum(a,b));
                	   System.out.println("Sub is: "+sub(a,b));
                	   print();
                   }
                   public static int sum (int a,int b){
                   //int n = a+b;
                   //return n;
                   return a+b;
                   }
                   public static int sub(int a, int b)
                   {
                	   //int n= a-b;
                	   //return n;
                	   return a-b;
                   }
                   public static void print()
                   {
                	   System.out.println("Hello World");
                   }
}
