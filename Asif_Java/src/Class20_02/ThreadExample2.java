package Class20_02;

public class ThreadExample2 {
	public static void main(String[]args) {
          Thread t1 = new Thread(new Run("First Thread"));
          t1.start();
          Thread t2 = new Thread(new Run("Second Thread"));
          t2.start();
	}
}
class Run implements Runnable{
	private String threadName;
	Run(String name){
		this.threadName = name;
		System.out.println("Creating: "+this.threadName);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running: "+this.threadName);
		try {
			for(int i=0;i<=10;i++) {
				System.out.println("Thread: "+this.threadName+" "+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException ex) {
			System.out.println(ex);
		}
		System.out.println("Thread"+this.threadName+"End");
		
	}
	
}