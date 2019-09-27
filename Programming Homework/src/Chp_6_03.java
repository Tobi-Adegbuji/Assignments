import java.util.Scanner; 
public class Chp_6_03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Enter a positive integer ");
		
		int reverseNum = input.nextInt();

		
		if(isPalindrome(reverseNum) == true) {
			
			System.out.println( reverseNum + " is a palindrome");
		}
		else {
			
			System.out.println( reverseNum +  " is not a palindrome ");
			
		}
		
		
		
	}
	
	
	
	
	
	public static int reverse (int num) {
		
		int reverseNum = 0;
		
		while(num != 0) {
			
			int numDigit = num % 10;
			
			reverseNum = reverseNum * 10 + numDigit;
			
			num /= 10; 
			
		}
		
		return reverseNum;
		
	}
	
	
	public static boolean isPalindrome(int num) {
		
		
		
		if(num == reverse(num)) {
			
			return true; 
			
		}
		
		return false; 
		
	}
	
	

}
