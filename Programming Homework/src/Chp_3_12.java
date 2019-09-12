import java.util.Scanner;

public class Chp_3_12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int userNum = input.nextInt();

		if (userNum < 0) {
			userNum *= -1;
		}

		int userNum1 = userNum;

		int reversedNum = 0;

		while (userNum1 > 0) {
			reversedNum = (userNum1 % 10) + (reversedNum * 10);
			userNum1 /= 10;
		}

		if (reversedNum == userNum) {
			System.out.println(userNum + " is a palindrome.");
		} else {
			System.out.println(userNum + " is not a palindrome. ");
		}

	}

}
