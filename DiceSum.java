package hw6;

import javax.swing.JOptionPane;

public class DiceSum {
	public static void main(String[] args) {
		
		int numOfRolls = 1;
		
		Die guess = new Die();
		
		Die die1 = new Die();
		Die die2 = new Die();
		Die die3 = new Die();
		Die die4 = new Die();
		
		Die sum = new Die();
		
		Die randomRoll = new Die();
		
		int userGuess = guess.getUserGuess();
		int die1Value = die1.getDieValue();
		int die2Value = die2.getDieValue();
		int die3Value = die3.getDieValue();
		int die4Value = die4.getDieValue();
		
		int point = sum.rollDie(die1Value, die2Value);
		int sumOfDie = randomRoll.rollDie(die3Value, die4Value);
		
		while (userGuess < 2 || userGuess > 12)
		{
			JOptionPane.showMessageDialog(null, "Invalid input, select a number between 2 and 12.");
			userGuess = guess.getUserGuess();
		}
		
		JOptionPane.showMessageDialog(null, "The dice read... " + die1.getDieValue() + " and " + die2.getDieValue() + ", point is " + point);
		
		while (sumOfDie != point)
		{
			
			String input2 = JOptionPane.showInputDialog(null, "Point is " + point + " . Roll again? Y/y or N/n.");
			char input3 = input2.charAt(0);
			numOfRolls++;
			
			if (input3 == 'Y' || input3 == 'y')
			{
				die3 = new Die();
				die4 = new Die();
				sumOfDie = die3.getDieValue() + die4.getDieValue();
				JOptionPane.showMessageDialog(null, "You roll a... " + sumOfDie);
			}
			else if (input3 == 'N' || input3 == 'n')
			{
				JOptionPane.showMessageDialog(null, "Select OK to exit program.");
				return;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Congratulations! It took you " + numOfRolls + " tries.");
		
		
	}
}
