import java.util.Scanner;
public class RandomNumberGuessingGame {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int choice = 1;
        System.out.println("================================");
        System.out.println(" RANDOM NUMBER GUESSING GAME ");
        System.out.println("================================");

        while (choice == 1) {
            int randomNumber = (int)(Math.random() * 100) + 1;
            int guess = 0;
            int attempts = 0;
            System.out.println("\nI have chosen a number between 1 and 100.");
            System.out.println("Try to guess it!");

            while (guess != randomNumber) {
                try {
                    System.out.print("Enter your guess: ");
                    guess = sc.nextInt();
                    attempts++;

                    if (guess > randomNumber) {
                        System.out.println("Too High! Try again.");
                    }
                    else if (guess < randomNumber) {
                        System.out.println("Too Low! Try again.");
                    }
                    else {
                        System.out.println("\nCorrect!");
                        System.out.println("You guessed the number in " + attempts + " attempts.");

                        if (attempts <= 5) {
                            System.out.println("Excellent!");
                        }
                        else if (attempts <= 10) {
                            System.out.println("Good Job!");
                        }
                        else {
                            System.out.println("You got there eventually!");
                        }
                    }
                }
                catch (Exception e) {
                    System.out.println("Invalid input! Please enter numbers only.");
                    sc.nextLine();
                }
            }
            try {
                System.out.println("\nPress 1 to play again.");
                System.out.println("Press 0 to exit.");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
            }

            catch (Exception e) {
                System.out.println("Invalid input! Exiting the game.");
                break;
            }
        }
        System.out.println("Thanks for playing!");
        sc.close();
    }
}