package hw6;

/*
 * Author : Justin Calderon
 * Date   : 2.24.23
 * Class  : CIS035
 */

import javax.swing.JOptionPane;

public class RandomGuess3 
{
    public static void main(String[] args) 
    {
        int randNum = generateRandomNumber();             
        int userGuess = getUserGuess();
        boolean isCorrect = checkUserGuess(randNum, userGuess);
        int guesses = 1;
        
        
        // WHILE LOOP
        while(isCorrect != true)
        {
        	if (userGuess != randNum)
        	{
        		guesses++;
        		JOptionPane.showMessageDialog(null, "Guess again.");
        		userGuess = getUserGuess();
        		checkUserGuess(randNum, userGuess);
        		isCorrect = false;
        	}
        	else if (userGuess == randNum)
        	{
        		JOptionPane.showMessageDialog(null, "Congratulations! You guessed " + guesses + " times.");
        		isCorrect = true;
        	}
        }   
        
// OLD FOR LOOP FROM HW5
//        for (int i = 1; i <= 3; i++) 
//        {
//            int userGuess = getUserGuess();
//            boolean isCorrect = checkUserGuess(randNum, userGuess);
//            
//            if (isCorrect) 
//            {
//                JOptionPane.showMessageDialog(null, "Congratulations! "
//                		+ "You guessed the correct number in " + i + " tries.");
//                return;
//            } 
//            else if (i == 3) 
//            {
//                JOptionPane.showMessageDialog(null, 
//                		"Sorry, you did not guess the correct number in 3 tries. "
//                		+ "The number was " + randNum + ".");
//            }
//        }
    }
    
    // Generate a random number
    private static int generateRandomNumber() 
    {
        return 1 + (int) (Math.random() * 10);
    }

    private static int getUserGuess() 
    {
        String input = JOptionPane.showInputDialog(null, "Guess a number between 1 and 10:");
        int guess = Integer.parseInt(input);
        return guess;
    }
    
    // Check boolean method
    private static boolean checkUserGuess(int randNum, int userGuess) 
    {
        if (userGuess == randNum) 
        {
            JOptionPane.showMessageDialog(null, "Your guess is correct!");
            return true;
        } 
        else if (userGuess < randNum) 
        {
            JOptionPane.showMessageDialog(null, "Your guess is too low.");
            return false;
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Your guess is too high.");
            return false;
        }
    }
}
