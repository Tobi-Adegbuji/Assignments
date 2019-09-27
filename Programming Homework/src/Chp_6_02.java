
import java.util.Scanner;

public class Chp_6_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
				
		long userNum = input.nextLong();	
		
		
		System.out.println("The sum of digits for " + userNum + " is " + sumDigits(userNum));
		
	}
	
	
	public static int sumDigits(long n) {
		
		int sum = 0; 
		long userNum = n; 
		
		for(int i = 0; i <  String.valueOf(n).length(); i++) {
			
			long temp = userNum % 10; 
			
			sum += temp; 
			
			userNum /= 10;
			
		}
		
		return sum;
		
	}
	

}
