import java.util.Scanner;
public class TestCall {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter you ID: ");
		int x = input.nextInt();
		int length = 0;
		while(x!=0) 
		{
			int temp = x % 10;
			if(temp!=0) 
			{
				length++;				
			}
			x = x/10;
		}
		CellPhone[] arr = new CellPhone[length];
		double sum = 0;
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter call duration: ");
			double d = input.nextDouble();
			arr[i] = new CellPhone(d);
			sum += arr[i].getCallDuration();
		}
		double avg = sum/(double)arr.length;
		System.out.println("Average Call duration: "+avg);
		input.close();
	}
}
