package Exam;

import java.util.Scanner;

public class GettingMiddleOfID {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter ID: ");
        String s = input.nextLine();
        
        String middle = middlechar(s);
        System.out.println(middle);
    }
    public static String middlechar(String s){
        int length = s.length();
        String str = "";
        
        if(length%2==0){
            str = str+s.charAt((length/2)-1)+s.charAt(length/2)+s.charAt((length/2)+1)+s.charAt((length/2)-2);
            return str;
        }else{
            str = str+s.charAt(length/2);
            return str;
        }
    }
}
