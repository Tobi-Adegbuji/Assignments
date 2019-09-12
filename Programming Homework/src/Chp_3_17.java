import java.util.Scanner;
import java.util.Random;

public class Chp_3_17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random pcChoice = new Random();
		System.out.println("scissor (0), rock (1), paper (2): ");

		int userChoice = input.nextInt();

		int pcAnswer = pcChoice.nextInt(2);

		String user = null;
		String pc = null;

		switch (userChoice) {

		case 0:
			user = "scissors";
			break;
		case 1:
			user = "rock";
			break;
		case 2:
			user = "paper";
			break;
		default:
			System.out.println("Picked an invalid choice");
		}
		
		switch (pcAnswer) {

		case 0:
			pc = "scissors";
			break;
		case 1:
			pc = "rock";
			break;
		case 2:
			pc = "paper";
			break;
		default:
			pc = "";
		}
		
		if (userChoice == 0 && pcAnswer == 2 || userChoice == 1 && pcAnswer == 0 || userChoice == 2 && pcAnswer == 1 ) {
			System.out.print("You are " + user + ". Computer is " + pc + ". You have won!");
		}
		else if(userChoice == pcAnswer) {
			System.out.print("You are " + user + ". Computer is " + pc + ". Its a draw.");
		}
		else if(userChoice > 2 || userChoice < 0) {
			System.out.println("You have lost due to not picking any choice.");
		}
		else  {
			System.out.print("You are " + user + ". Computer is " + pc + ". You have lost.");
		}
		

	}

}
