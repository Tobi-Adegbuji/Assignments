
import java.util.Scanner; 

public class Chpt_2_08 {

	public static void main(String[] args) {
		 Scanner y = new Scanner(System.in);
	      
				System.out.println("Enter the time zone offset to GMT: ");
				 long x = y.nextLong();
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		        long totalMilliseconds = System.currentTimeMillis();
		    
		        // Obtain the total seconds since midnight, Jan 1, 1970
		        long totalSeconds = totalMilliseconds / 1000;
		    
		        // Compute the current second in the minute in the hour
		       long currentSecond = totalSeconds % 60;
		   
		       // Obtain the total minutes
		       long totalMinutes = totalSeconds / 60;
		   
		       // Compute the current minute in the hour
		       long currentMinute = totalMinutes % 60;
		   
		       // Obtain the total hours
		       long totalHours = totalMinutes / 60;
		   
		       // Compute the current hour
		       long currentHour = ((totalHours + x) % 24);
		   
		       System.out.println("New Time: " + currentHour);
		      
	}

}
