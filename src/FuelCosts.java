
import java.util.Scanner;

public class FuelCosts {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean done = false;
        double tankCapacity;
        double milesPerGallon;
        double pricePerGallon;
        String trash;
        do {
            System.out.print("How Many Gallons does your Tank Hold: ");
            if (scanner.hasNextDouble()) {
                tankCapacity = scanner.nextDouble();
                System.out.print("How Many Miles Per Gallon do you Get: ");
                if (scanner.hasNextDouble()) {
                    milesPerGallon = scanner.nextDouble();
                    System.out.print("What is the Price of a Gallon of Gas: ");
                    if (scanner.hasNextDouble()) {
                        pricePerGallon = scanner.nextDouble();
                        double costToDrive100Miles = (100 / milesPerGallon) * pricePerGallon;
                        double distanceOnFullTank = (milesPerGallon * tankCapacity);
                        System.out.println("To Drive 100 Miles it Would Cost $" + costToDrive100Miles);
                        System.out.println("On a Full Tank you Can Go: " + distanceOnFullTank + " miles");
                        done = true;
                    } else {
                        trash = scanner.nextLine();
                        System.out.println("Must be a number");
                    }
                } else {
                    trash = scanner.nextLine();
                    System.out.println("Must be a number");
                }
            } else {
                trash = scanner.nextLine();
                System.out.println("Must be a number");
            }
        } while(!done);
    }
}
