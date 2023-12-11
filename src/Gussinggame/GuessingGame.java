package Gussinggame;

import java.awt.Component;
import javax.swing.JOptionPane;

public class GuessingGame {
    public GuessingGame() {
    }

    public static void main(String[] args) {
        int computerNumber = (int)(Math.random() * 100.0 + 1.0);
        int userAnswer = 0;
        System.out.println("The correct guess would be " + computerNumber);

        for(int count = 1; userAnswer != computerNumber; ++count) {
            String response = JOptionPane.showInputDialog((Component)null, "Enter a guess between 1 and 100", "Guessing Game", 3);
            userAnswer = Integer.parseInt(response);
            String var10001 = determineGuess(userAnswer, computerNumber, count);
            JOptionPane.showMessageDialog((Component)null, "" + var10001);
        }

    }

    public static String determineGuess(int userAnswer, int computerNumber, int count) {
        if (userAnswer > 0 && userAnswer <= 100) {
            if (userAnswer == computerNumber) {
                return "Correct!\nTotal Guesses: " + count;
            } else if (userAnswer > computerNumber) {
                return "Your guess is too high, try again.\nTry Number: " + count;
            } else {
                return userAnswer < computerNumber ? "Your guess is too low, try again.\nTry Number: " + count : "Your guess is incorrect\nTry Number: " + count;
            }
        } else {
            return "Your guess is invalid";
        }
    }
}
