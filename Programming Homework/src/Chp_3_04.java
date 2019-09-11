import java.util.Random;

public class Chp_3_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random monthNum = new Random();
		
		int randomNum = monthNum.nextInt(12) + 1; 
		
		switch (randomNum) {
		
		case 1: 
			System.out.println("The Month " + randomNum + " is January.");
			break; 
		case 2: 
			System.out.println("The Month " + randomNum + " is Feburary.");
			break; 
		case 3: 
			System.out.println("The Month " + randomNum + " is March.");
			break; 
		case 4: 
			System.out.println("The Month " + randomNum + " is April.");
			break; 
		case 5: 
			System.out.println("The Month " + randomNum + " is May.");
			break; 
		case 6: 
			System.out.println("The Month " + randomNum + " is June.");
			break; 
		case 7: 
			System.out.println("The Month " + randomNum + " is July.");
			break; 
		case 8: 
			System.out.println("The Month " + randomNum + " is August.");
			break; 
		case 9: 
			System.out.println("The Month " + randomNum + " is September.");
			break; 
		case 10: 
			System.out.println("The Month " + randomNum + " is October.");
			break; 
		case 11: 
			System.out.println("The Month " + randomNum + " is November.");
			break; 
		case 12: 
			System.out.println("The Month " + randomNum + " is December.");
			break; 
		default: 
			System.out.println("The Month " + randomNum + " .");
			break; 
		
		}
		
	}

}
