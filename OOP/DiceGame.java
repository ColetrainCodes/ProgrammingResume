

public class DiceGame {

	public static void main(String[] args) {

		int finalNumber;

		Dice d = new Dice();

		String inputString = d.getInputString();

		String[] tokens = d.parseInputString(inputString);

		int numberOfDice = Integer.parseInt(tokens[0]);
		int numberOfSides = Integer.parseInt(tokens[2]);

		finalNumber = d.rollTheDice(numberOfDice, numberOfSides);

		System.out.println(finalNumber);
		
	}
}











	