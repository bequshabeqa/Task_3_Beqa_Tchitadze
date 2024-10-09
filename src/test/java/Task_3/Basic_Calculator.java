package Task_3;

import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // chawere ori integers
        System.out.print("sheiyvane pirveli integer: ");
        int num1 = scanner.nextInt();

        System.out.print("sheiyvane meore integer: ");
        int num2 = scanner.nextInt();

        // chawere moqmedeba
        System.out.print("chawere moqmedeba (+, -, *, /, //): ");
        String moqmedeba = String.valueOf(scanner.next().charAt(0));

        // calculatori
        if (moqmedeba.equals("+")) {
            System.out.println("shedegi: " + (num1 + num2));
        } else if (moqmedeba.equals("-")) {
            System.out.println("shedegi: " + (num1 - num2));
        } else if (moqmedeba.equals("*")) {
            System.out.println("shedegi: " + (num1 * num2));
        } else if (moqmedeba.equals("/")) {
            System.out.println("shedegi: " + num1 / num2);
        }

        // o-ze gayofis akrdzalva
        else if (moqmedeba.equals(num2 != 0)) {
            System.out.println("shedegi: " + (num1 / num2));
        } else if (moqmedeba.isEmpty()) {
            System.out.println("Error: o-ze gayofa ar sheidzleba.");
        } else {
            System.out.println("Error: aseti moqmedeba ar arsebobs.");
        }

        // Close the scanner
        scanner.close();
    }
}