
import java.util.Scanner;

public class Chp_7_14 {

	// MAIN MEHTD BEGIN

	public static void main(String[] args) {

		int array[] = new int[5];

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Five integers: ");

		for (int i = 0; i < array.length; i++) {

			array[i] = input.nextInt();

		}

		for (int value : array) {

			System.out.print(value);

		}

		System.out.println("GCD is: " + gcd(array));

		gcd(array);

	}

	// MAIN METHOD END

	// FOUND MIN IN ARRAY

	public static int minimum(int[] array) {

		int min = array[0];

		for (int value : array) {

			if (value < min) {

				min = value;

			}

		}

		return min;

	}

	public static int gcd(int[] array) {

		int min = minimum(array);

		int k = 0;

		int gcd = 1;

		for (int i = 1; i < min + 1; i++) {

			for (int j : array) {

				if (j % i == 0) { // k is used to verify if all elements in an array are divisible by i 

					k++;
				}

				if (k == array.length) {

					gcd = i;

				}

			}

			k = 0;

		}

		return gcd;

	}

}
