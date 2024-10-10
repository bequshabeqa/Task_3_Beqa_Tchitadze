package Task_3;

import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ჩაწერე ორი integers
        System.out.print("ჩაწერე პირველი integer: ");
        int num1 = scanner.nextInt();

        System.out.print("ჩაწერე მეორე integer: ");
        int num2 = scanner.nextInt();

        // ჩაწერე მოქმედება
        System.out.print("ჩაწერე მოქმედება (+, -, *, /, //): ");
        String moqmedeba = String.valueOf(scanner.next().charAt(0));

        // კალკულატორი
        if (moqmedeba.equals("+")) {
            System.out.println("შედეგი: " + (num1 + num2));
        } else if (moqmedeba.equals("-")) {
            System.out.println("შედეგი: " + (num1 - num2));
        } else if (moqmedeba.equals("*")) {
            System.out.println("შედეგი: " + (num1 * num2));
        } else if (moqmedeba.equals("/")) {
            System.out.println("შედეგი: " + num1 / num2);
        }

        // o-ზე გაყოფის აკრძალვა
        else if (moqmedeba.equals(num2 != 0)) {
            System.out.println("შედეგი: " + (num1 / num2));
        } else if (moqmedeba.isEmpty()) {
            System.out.println("Error: 0-ზე გაყოფა არ შეიძლება.");
        } else {
            System.out.println("Error: ასეთი მოქმედება არ არსებობს!");
        }

        // Close the scanner
        scanner.close();
    }
}