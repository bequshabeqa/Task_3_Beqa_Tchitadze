package Task_3;

import java.util.Scanner;

public class Run3 {

    public class BasicCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input two integers
            System.out.print("Enter first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second integer: ");
            int num2 = scanner.nextInt();

            // Input operator
            System.out.print("Enter an operator (+, -, *, //): ");
            char operator = scanner.next().charAt(0);

            // Perform calculation based on the operator
            switch (operator) {
                case '+':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case '/':
                    // Handle division by zero
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    break;
            }

            // Close the scanner
            scanner.close();
        }
    }
}