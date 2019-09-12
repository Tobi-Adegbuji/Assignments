import java.util.Scanner;
public class Chp_3_19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three edges (length in double): ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double perimeter;
		
		if(a + b > c && a + c > b && b + c > a ) {
			
			perimeter =  a + b + c;
			System.out.println("The perimeter is " + perimeter);
		}else
			System.out.println("Input is invalid.");
		
		 
		
		
	}

}
