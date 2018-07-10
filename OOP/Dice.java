import java.util.Scanner;
import java.util.Random;

public class Dice {

	private int numberOfDice;
	private int numberOfSides;
	private String inputString;	

	public String getInputString() {
		System.out.println("Enter your username: ");
		Scanner scanner = new Scanner(System.in);
		inputString = scanner.nextLine();

		return inputString;
	}

	public String[] parseInputString(String hutch) {
		String phrase = hutch;
		String[] tokens = phrase.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

		return tokens;
	}

	public int rollTheDice(int diceCount, int sideCount) {

		int min = diceCount;
		int max = diceCount * sideCount;

		Random rand = new Random();
		int n = rand.nextInt((max-min) + 1 + min);
		return n;
	}
}
