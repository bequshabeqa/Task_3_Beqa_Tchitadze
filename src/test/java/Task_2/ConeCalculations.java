package Task_2;

import java.util.Scanner;

public class ConeCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input radius, height, and slant height
        System.out.print("Enter the radius (r) of the cone: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height (h) of the cone: ");
        double height = scanner.nextDouble();

        System.out.print("Enter the slant height (s) of the cone: ");
        double slantHeight = scanner.nextDouble();

        // Calculate surface area
        double surfaceArea = Math.PI * radius * (radius + slantHeight);

        // Calculate volume
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;

        // Print results
        System.out.printf("Surface Area of the cone: %.2f\n", surfaceArea);
        System.out.printf("Volume of the cone: %.2f\n", volume);

        // Close the scanner
        scanner.close();
    }
}
