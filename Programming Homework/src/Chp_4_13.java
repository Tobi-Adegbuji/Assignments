import java.util.Scanner;
public class Chp_4_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter: ");
		
		char character = input.next().charAt(0);
		
		int cha = (int) character;
		
		if(cha == 97 || cha == 101 || cha == 105 || cha == 111 || cha ==117) {
			
			System.out.println(character + " is a vowel.");
			
		}
		else if(cha == 65 || cha == 69 || cha == 73 || cha == 79 || cha == 85) {
			System.out.println(character + " is a vowel.");
		}
		else {
			System.out.println(character + " is a const");
		}
		
		
	}

}
//97 101 105111 117
//65 69 73 79 85