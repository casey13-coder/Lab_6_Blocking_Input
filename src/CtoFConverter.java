import java.util.Scanner;

public class CtoFConverter {
    static void main() {
        boolean done = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("What temperature in C do you want in F: ");
            if (scanner.hasNextDouble()) {
                double temperatureInC = scanner.nextDouble();
                double temperatureInF = (temperatureInC * 9/5) + 32;
                System.out.println("The temperature in F is: " + temperatureInF);
                done = true;
            } else {
                String trash = scanner.nextLine();
                System.out.println("This input was not a number, try again");
            }

        } while (!done);

    }
}
