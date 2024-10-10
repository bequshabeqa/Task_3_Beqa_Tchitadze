package Task_5;

import java.util.Scanner;

public class Weighted_Avarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // შეფასების და წონის მნიშვნელობები
        double[] scores = new double[5];
        double[] weights = new double[5];

        // ჩაწერე შეფასება და წონა
        for (int i = 0; i < 5; i++) {
            System.out.print("ჩაწერე შეფასების მნიშვნელობა " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();

            System.out.print("ჩაწერე წონის მნიშვნელობა " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();
        }

        // წონის კალკულატორი
        double weightedSum = 0;
        double totalWeights = 0;

        for (int i = 0; i < 5; i++) {
            weightedSum += scores[i] * weights[i];
            totalWeights += weights[i];
        }

        // 0-ზე გაყოფის შემოწმება
        if (totalWeights == 0) {
            System.out.println("Error: წონის ჯამი არ უნდა იყოს 0-ის ტოლი.");
        } else {
            double weightedAverage = weightedSum / totalWeights;
            System.out.printf("საშუალო წონა არის: %.2f\n", weightedAverage);
        }

        // Close the scanner
        scanner.close();
    }
}