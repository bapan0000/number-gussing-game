# number-gussing-game
The number guessing game is a classic game that can be implemented in many different programming languages. In this Java implementation, the game involves the user guessing a random number generated by the computer, within a given range.

The game starts by generating a random number between 1 and 100, using the Random class in Java. The user is then prompted to enter their guess in a displayed dialogue box. If the user's guess is not correct, the computer will give feedback on whether the guess is too high or too low, and the user will be prompted to enter another guess.

The game continues until the user successfully guesses the correct number, or until they reach the maximum number of attempts, which is set to 10 in this implementation. If the user is unable to guess the number within the maximum number of attempts, the game ends and the computer reveals the correct number.

To handle user input and feedback, the code uses the JOptionPane class in Java, which allows for easy input/output dialogues to be displayed. The user's score is displayed when they successfully guess the number, and is based on the number of attempts it took them to guess the number.

The code also incorporates some error handling to ensure that the user enters a valid guess. For example, if the user enters a non-numeric value or leaves the input field blank, an error message will be displayed and they will be prompted to enter a valid guess.

Overall, this implementation of the number guessing game in Java is a fun and interactive way for users to test their guessing skills, while also providing opportunities for error handling and score tracking. It's a great example of how basic programming concepts, such as random number generation, user input/output, and error handling, can be combined to create a simple yet engaging game.
