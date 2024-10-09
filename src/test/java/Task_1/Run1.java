package Task_1;
import java.util.Scanner;

public class Run1 {
    public static void main(String[] args) {

    }

    private static class ComplexArithmeticExpression {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input floating-point numbers a, b, and c
            System.out.print("Enter value for a (a != 0): ");
            double a = scanner.nextDouble();

            System.out.print("Enter value for b (b != 0): ");
            double b = scanner.nextDouble();

            System.out.print("Enter value for c (c >= 0): ");
            double c = scanner.nextDouble();

            // Validate input
            if (a == 0) {
                System.out.println("Error: a must not be zero.");
                return;
            }
            if (b == 0) {
                System.out.println("Error: b must not be zero.");
                return;
            }
            if (c < 0) {
                System.out.println("Error: c must be non-negative.");
                return;
            }

            // Calculate the expression
            double numerator = Math.pow(a, 3) + Math.pow(b, 2) - Math.sqrt(c);
            double denominator = (a * b) + c;

            // Check for division by zero
            if (denominator == 0) {
                System.out.println("Error: Division by zero.");
                return;
            }

            double x = numerator / denominator;

            // Print the result
            System.out.printf("The result of the calculation is: %.4f\n", x);

            // Close the scanner
            scanner.close();
        }
    }
}
