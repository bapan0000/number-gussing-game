import java.util.Random;
import javax.swing.JOptionPane;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int attempts = 0;
        boolean guessed = false;

        while (!guessed) {
            String guessString = JOptionPane.showInputDialog("Guess the number between 1 and 100");
            int guess = Integer.parseInt(guessString);
            attempts++;

            if (guess == number) {
                guessed = true;
                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number in " + attempts + " attempts.");
            } else if (guess < number) {
                JOptionPane.showMessageDialog(null, "Your guess is too low. Please try again.");
            } else if (guess > number) {
                JOptionPane.showMessageDialog(null, "Your guess is too high. Please try again.");
            }

            if (attempts == 10) {
                JOptionPane.showMessageDialog(null, "You have reached the maximum number of attempts. The number was " + number + ".");
                break;
            }
        }
    }
}
