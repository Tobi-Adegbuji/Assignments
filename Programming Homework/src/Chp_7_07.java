
import java.util.Random;

public class Chp_7_07 {

	public static void main(String[] args) {

		Random x = new Random();

		int[] counts = new int[100];
		
		int num = 1;

		for (int i = 0; i < counts.length; i++) {

			counts[i] = x.nextInt(10);

		}
		
		for(int i = 0; i < counts.length; i++, num++) {
			
			System.out.println("Count " + num + " is: " + counts[i] );
			
		}
		

	}

}
