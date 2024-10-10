package Task_2;

import java.util.Scanner;

public class ConeCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // შეიყვანე რადიუსი, სიმაღლე და დახრის სიმაღლე
        System.out.print("დაწერეთ რადიუსის სიგრძე (r): ");
        double radius = scanner.nextDouble();

        System.out.print("დაწერეთ სიმაღლე (h): ");
        double height = scanner.nextDouble();

        System.out.print("დაწერეთ დახრის სიმაღლე (s): ");
        double slantHeight = scanner.nextDouble();

        // გამოთვალეთ ზედაპირის ფართობი
        double surfaceArea = Math.PI * radius * (radius + slantHeight);

        // მოცულობა
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;

        // დაბეჭდე შედეგები
        System.out.printf("ზედაპირის ფართობი: %.2f\n", surfaceArea);
        System.out.printf("ცილინდრის მოცულობა: %.2f\n", volume);

        // Close the scanner
        scanner.close();
    }
}
