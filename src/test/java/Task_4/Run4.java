package Task_4;

import java.util.Scanner;

    class BasicCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input Amount valute, Exchange rate, Received valute
            System.out.print("Enter Amount valute: ");
            double Amount = scanner.nextDouble();

            System.out.print("Enter Exchange rate: ");
            double Exchange = scanner.nextDouble();

            System.out.print("Enter Fee Percentage: ");
            double Fee = scanner.nextDouble();

            // Calculate Exchange Rate
            double EUR = Amount * Exchange * (1-(Fee/100));


            // Print result
            System.out.printf("EUR Received: %.2f\n", EUR);

            // Close the scanner
            scanner.close();
        }
    }