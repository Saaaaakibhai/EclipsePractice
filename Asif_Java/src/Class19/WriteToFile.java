package Class19;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
   public static void main (String[]args) {
	   try {
		FileWriter w = new FileWriter("test.txt");	
	}
	   catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
