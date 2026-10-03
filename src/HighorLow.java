import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    static void main() {
        boolean done = false;
        do {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int randomNumber = random.nextInt(10);
            System.out.print("Guess a number 1-10: ");
            if (scanner.hasNextInt()) {
                int guess = scanner.nextInt();
                if (guess >= 1 && guess <= 10) {
                    if (guess == randomNumber) {
                        System.out.println("You got it right!");
                    } else if (guess > randomNumber) {
                        System.out.println("Too high");
                    }
                    else {
                        System.out.println("Too low");
                    }
                    done = true;
                }
                else {
                    System.out.println("Not between 1-10");
                }
            }
            else {
                System.out.println("Not a number");
            }

        } while(!done);

    }
}
