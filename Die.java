package hw6;

import javax.swing.JOptionPane;

public class Die {
	
	private int dieValue;
	private int sumOfDie;
	
	public Die() {
		dieValue = ((int)(Math.random() * 100) % 6 + 1);
	}
	
	public int getDieValue() {
		return dieValue;
	}
	
	public int rollDie(int die1, int die2) {
		sumOfDie = die1 + die2;
		return sumOfDie;
	}
	
	public int getUserGuess() 
    {
        String input = JOptionPane.showInputDialog(null, "Guess a number between 2 and 12:");
        int guess = Integer.parseInt(input);        
        return guess;
    }
}
