import java.util.Random;

public class Chp_3_24 {

	public static void main(String[] args) {

		Random card = new Random();

		String[] x = { "Jack", "Queen", "Ace", "King", "2", "3", "4", "5", "6", "7", "8", "9", "10", };

		int randomName = card.nextInt(x.length);
		
		String[] y = {"Hearts", "Spades","Diamonds","Clubs"};
		
		int randomSuit = card.nextInt(y.length);

		System.out.println("The card you picked is " + x[randomName] + " of " + y[randomSuit]);

	}

}
