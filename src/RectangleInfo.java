import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        if (width <= 0) {
            System.out.println("Width must be positive.");
            return;
        } else {
            System.out.println("Width accepted.");
        }

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        if (height <= 0) {
            System.out.println("Height must be positive.");
            return;
        } else {
            System.out.println("Height accepted.");
        }

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);

        input.close();
    }
}

