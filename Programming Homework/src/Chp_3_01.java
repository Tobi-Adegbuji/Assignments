import java.util.Scanner;

public class Chp_3_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter values for a, b, and c: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double disc = Math.pow(b, 2) - (4 * a * c); 
		
		if(disc > 0) {
			double root1 = ((-b) + Math.sqrt(disc))/ (2 * a);
			double root2 = ((-b) - Math.sqrt(disc))/ (2 * a);
			System.out.println("The two roots are: " + root1 + " " + root2);
		}
		else if(disc == 0) {
			double root1 = ((-b) + Math.sqrt(disc))/ (2 * a);
			System.out.println("The root is: " + root1);
		}
		else {
			System.out.println("There are no real roots");
		}
		
	}

}

//b^2 - 4ac