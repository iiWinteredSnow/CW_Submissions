package wordleProject;
import java.util.HashSet;
import java.util.Scanner;

public class WordleProject {
/*


nah i think its done now
finally its done
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Hardcoded solution word
        final String solution = "prime";
        final int wordLength = 5;
        
        System.out.println("Welcome to Wordle! Try to guess the 5-letter word.");
        if(!isValidWord(solution)) {
        	System.out.println("The 5-letter word is invalid. Exiting the game. Please change the word and re-run the code.");
        	System.exit(0); // stops the running code.
        }
        while (true) {
            System.out.println("\nPlease make a guess:");
            String guess = scanner.nextLine().toLowerCase();

            // Check for valid input
            if (!isValidGuess(guess, wordLength)) {
                System.out.println("Invalid guess! Please enter a 5-letter word with no repeating letters.");
                continue;
            }
            
            // Compare guess to the solution
            String feedback = getFeedback(guess, solution);
            System.out.println(feedback);
            
            // Check if the user guessed the word correctly
            if (feedback.equals(solution)) {
                System.out.println("Good job! You got the word, it was " + solution + "!");
                break;
            }
        }
        
        scanner.close();
    }
    
    // Method to check if the guess is valid
    private static boolean isValidGuess(String guess, int wordLength) {
        if (guess.length() != wordLength) {
            return false;
        }

        for (int i = 0; i < guess.length(); i++) {
            for (int j = i + 1; j < guess.length(); j++) {
                if (guess.charAt(i) == guess.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    // Method to generate feedback for the guess
    private static String getFeedback(String guess, String solution) {
        StringBuilder feedback = new StringBuilder();
        
        for (int i = 0; i < guess.length(); i++) {
            char guessedChar = guess.charAt(i);
            
            if (guessedChar == solution.charAt(i)) {
                feedback.append(guessedChar); // Correct letter and position
            } else if (solution.contains(String.valueOf(guessedChar))) {
                feedback.append('?'); // Correct letter, wrong position
            } else {
                feedback.append('X'); // Incorrect letter
            }
        }
        
        return feedback.toString();
    }
    private static boolean isValidWord(String solution) { // method to check if the word selected for wordle is valid.
        for (int i = 0; i < solution.length(); i++) {
            for (int j = i + 1; j < solution.length(); j++) {
                if (solution.charAt(i) == solution.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
