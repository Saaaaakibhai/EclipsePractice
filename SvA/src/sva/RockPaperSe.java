package sva;
import java.util.*;
public class RockPaperSe {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Rock ,paper of scissor: ");
		String myMove=sc.nextLine();
		if(!myMove.equals("rock")&& !myMove.equals("paper")&& !myMove.equals("scissor")) {
			System.out.println("your input is invalid");
		}
		else
		{
			int rand=(int)(Math.random()*3);
			String opponontMove="";
			if(rand==0)
			{
				opponontMove="rock";
			}
			else if(rand==1) {
				opponontMove="paper";
			}
			else if(rand==2)
				opponontMove="scissor";
			
			System.out.println(opponontMove);
		    if(myMove.equals(opponontMove)) {
		    	System.out.println("TIE");
		    }
		    else if((myMove.equals("paper")&& opponontMove.equals("rock"))||(myMove.equals("scissor")
		    		&&opponontMove.equals("paper"))||(myMove.equals("rock")&& opponontMove.equals("scissor"))) {
		    	System.out.println("YOu won SAMI!!");
		    	
		    }
		    else if((opponontMove.equals("paper")&& myMove.equals("rock"))||(opponontMove.equals("scissor")
		    		&&myMove.equals("paper"))||(opponontMove.equals("rock")&& myMove.equals("scissor"))){
		    	System.out.println("You lost SAMI!!");
		    }
		    
		}
			
	}
}
