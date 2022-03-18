import java.util.Scanner;
public class Problem7 {

    public static void main(String[] args) {
    	int i , sum = 0 , avg =0 ,n = 0;
        int max = 0;
        Scanner input = new Scanner(System.in);     
        System.out.println("Enter how many numbers you wanna put: ");
        n = input.nextInt();
        int [] arr = new int [10];
        System.out.println("Enter the element(int): ");
		for(i=0 ; i<n ; i++) {
        	arr[i]=input.nextInt();
        	sum += arr[i];
        	if(arr[i]>max) {
            	max=arr[i];
            }
		}
            
		System.out.println("Total : " +sum);
        avg = sum/n;
        System.out.println("Average: " +avg);
		System.out.println("Largest number: "+max);
		
        input.close();
			

            }

		
    }

