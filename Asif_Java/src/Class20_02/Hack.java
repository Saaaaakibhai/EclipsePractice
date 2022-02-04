package Class20_02;

public class Hack {
   public static void main(String[]args) {
	   NSU admin = new NSU();
	   admin.start();
	   try {
		   while(admin.isAlive()) {
			   System.out.println("Hacking on Process...");
			   Thread.sleep(5000);
		   }
	   }catch(InterruptedException ex) {
		   System.out.println(ex);
	   }
	   System.out.println("NSU Hacked!!");
   }
}
class NSU extends Thread{
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println(i*10+"%");
				Thread.sleep(500);
			}
		}catch(InterruptedException ex) {
			System.out.println(ex);
		}
		System.out.println("Successfully Hacked!");
	}
}