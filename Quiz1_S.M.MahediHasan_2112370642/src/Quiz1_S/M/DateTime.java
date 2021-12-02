package Quiz1_S.M;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		
		//Date
		LocalDate date = LocalDate.now(); // Create a date object
		System.out.println(date); // Display the current date
		
		//Date and Time
		LocalDateTime datetime = LocalDateTime.now();
	    System.out.println(datetime);
	    
	    //Time
	    LocalTime time = LocalTime.now(); // Create a date object
		System.out.println(time); // Display the current date
		
		
		//Date and Time formatting
		LocalDateTime now = LocalDateTime.now();    
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime = now.format(format);  
        System.out.println("After Formatting: " + formatDateTime);  
        
        
    	//Displaying current date and time in 12 hour format with AM/PM
    	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh.mm aa");
    	String dateString = dateFormat.format(new Date()).toString();
    	System.out.println("Current date and time in AM/PM: "+dateString);
	}

}