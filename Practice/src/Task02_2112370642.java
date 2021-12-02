import java.util.Scanner;

public class Task02_2112370642 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter any string : ");
            String sentence = input.nextLine();
            
            // use this method & "//s" for avoiding space 
            
            String userInput = sentence.replaceAll("\\s","");
            char temp;
            //taking character as Array 
            char[] charArray = userInput.toCharArray();
            
            //use nested loop,compare character to sorted.
            
            for (int i = 0; i < charArray.length; i++) {
                for (int j = i + 1; j < charArray.length; j++) {
                //According to the Value it take charArray [start from index 0]
                    if (Character.toLowerCase(charArray[i]) > Character.toLowerCase(charArray[j])) 
                    { 
                    	//exchanging position according to value 
                    	//going to swap all alphabetic char until end
                    	temp = charArray[i];
                        charArray[i] = charArray[j];
                        charArray[j] = temp;
                    }
                }
            }
            //Showing Output
            System.out.println(new String(charArray));
            input.close();
        }

}