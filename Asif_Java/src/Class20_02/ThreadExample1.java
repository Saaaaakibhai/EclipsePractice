package Class20_02;

public class ThreadExample1 {
       public static void main(String[]args) {
    	   Count obj = new Count();
   		obj.start();
   		try {
   			while(obj.isAlive()) {
   				System.out.println("Main thread is running...");
   				Thread.sleep(5000);
   			}
   		}catch(InterruptedException ex) {
   			System.out.println(ex);
   		}
   		System.out.println("Main thread is over!");
   		

   	}
       }
       class Count extends Thread{
    	   public void run() {
    		
    			   try {
    				   for(int i=0;i<10;i++) 
    				   {
    	    			   System.out.println(i);
					       Thread.sleep(1000);
				       } 
             }
    			   catch (InterruptedException ex){
					System.out.println(ex);
			}
    			 System.out.println("Count thread is over! ");  
    			   
   }
}    		   
    	   
 

