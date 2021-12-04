package Lab02;

import java.util.Scanner;

public class task05 {
            public static void main(String[]args) {
            	Scanner input = new Scanner(System.in);
            	int play;
                do {
            	System.out.println();
            	//giving my value
            	System.out.println("scissor (0), rock (1), paper (2): ");
            	play = input.nextInt();
            	int computer = (int) (Math.random()*2-0+1-0);
            	
            	if(computer==0) {
            		switch(play) {
            		case 0: 
            			System.out.println("Computer is scissor and you are scissor,The match is draw");
            			break;
            			case 1:
            			System.out.println("Computer is scissor and you are rock,you are win");
            			break;
            			case 2:
            			System.out.println("Computer is scissor and you are paper,computer is win");
            			break;
            			default: 
            				System.out.println("Wrong Play");
            	      }
            	}
            	else if (computer ==1) {
            	switch(play){
            	case 0: 
        			System.out.println("Computer is rock and you are scissor,computer is win");
        			break;
        			case 1:
        			System.out.println("Computer is rock and you are rock,This match is draw");
        			break;
        			case 2:
        			System.out.println("Computer is rock and you are paper,you are win");
        			break;
        		default: 
    				System.out.println("Wrong Play");
            	}
            	           	
            }
            	else if (computer ==2) {
                	switch(play){
                	case 0: 
            			System.out.println("Computer is paper and you are scissor,you are win");
            			break;
            		case 1:
            			System.out.println("Computer is paper and you are rock,Computer is win");
            			break;
            		case 2:
            			System.out.println("Computer is paper and you are paper,This Match is draw");
            			break;
            		default: 
        				System.out.println("Wrong Play");
                	}
                	           	
                }	
    }while(play==0||play==1||play==2);
    }
}