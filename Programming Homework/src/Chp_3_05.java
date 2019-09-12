import java.util.Scanner;

public class Chp_3_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter today's date: ");
		int userCurrentDay = input.nextInt();
		System.out.println("Enter the number of days elapsed since today: ");
		int userForecast = input.nextInt();
		String stringDay = null;
		String stringDayF = null;

		int answer = userForecast + userCurrentDay;

		if (answer > 6)
			answer %= 7;
			

		switch (userCurrentDay) {

		case 0:
			stringDay = "Sunday"; 
			break;
		case 1:
			stringDay = "Monday";
			break;
		case 2:
			stringDay = "Tuesday";
			break;
		case 3:
			stringDay = "Wednsday";
			break;
		case 4:
			stringDay = "Thursday";
			break;
		case 5:
			stringDay = "Friday";
			break;
		case 6:
			stringDay = "Saturday";
			break;
		default:
			System.out.println("You entered an invalid day. Try again. ");
		}
		
			switch (answer) {

			case 0:
				stringDayF = "Sunday";
				break;
			case 1:
				stringDayF = "Monday";
				break;
			case 2:
				stringDayF = "Tuesday";
				break;
			case 3:
				stringDayF = "Wednsday";
				break;
			case 4:
				stringDayF = "Thursday";
				break;
			case 5:
				stringDayF = "Friday";
				break;
			case 6:
				stringDayF = "Saturday";
				break;
			default:
				System.out.println(" ");
			
			}
		

			System.out.println("Today is: " + stringDay +" and the future day is " + stringDayF);
			
		}

	}


