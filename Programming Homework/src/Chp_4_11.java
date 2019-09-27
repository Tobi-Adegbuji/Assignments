import java.util.Scanner;
public class Chp_4_11 {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("Enter any decimal value (0 - 15): ");
		
		int num = user_input.nextInt();
		
		if (num < 0 || num > 15) {
		System.out.println("Invalid input!");
		}
		else
			System.out.println("The hex value is: " + decimal2Hexa(num));

			
	}

	
	 public static String decimal2Hexa(int x) {
//			
		 

			int remainder;

			String[] hexa = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
			String hexaValue = "";

			while (x > 0) {

				remainder = x % 16;

				hexaValue = hexa[remainder] + hexaValue;

				x = x / 16;
			}

//			System.out.println("Hexa Value is: " + hexaValue);
			return hexaValue;

	
	
	
}
	 }
