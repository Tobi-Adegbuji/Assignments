
import java.util.Scanner;

public class Chpt_2_14 {

	public static void main(String[] args) {

		double kilograms = 0.45359237;
		double meters = 0.0254;

		Scanner x = new Scanner(System.in);

		System.out.println("Enter Height in Inches: ");

		double userInches = x.nextDouble();

		System.out.println("Enter Weight in Pounds: ");

		double userWeight = x.nextDouble();

		userWeight *= kilograms;

		userInches *= meters;

		double bmi = userWeight / Math.pow(userInches, 2);

		System.out.println("Your BMI is: " + bmi);

	}

}
