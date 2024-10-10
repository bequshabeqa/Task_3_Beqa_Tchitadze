package Task_1;
import java.util.Scanner;

public class Complex_Arithmeti_Expression {
    private static class ComplexArithmeticExpression {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // ჩაწერე რიცხვები: a, b, და c
            System.out.print("ჩაწერე a-ს მნიშვნელობა, სადაც (a != 0): ");
            double a = scanner.nextDouble();

            System.out.print("ჩაწერე b-ს მნიშვნელობა, სადაც (b != 0): ");
            double b = scanner.nextDouble();

            System.out.print("ჩაწერე c-ს მნიშვნელობა, სადაც (c >= 0): ");
            double c = scanner.nextDouble();

            // ვალიდური ინფორმაცია
            if (a == 0) {
                System.out.println("Error: a არ უნდა უდრიდეს 0-ს.");
                return;
            }
            if (b == 0) {
                System.out.println("Error: b არ უნდა უდრიდეს 0-ს.");
                return;
            }
            if (c < 0) {
                System.out.println("Error: c არ უნდა იყოს უარყოფითი.");
                return;
            }

            // მნიშვნელი და მრიცხველის მნიშვნელობები
            double numerator = Math.pow(a, 3) + Math.pow(b, 2) - Math.sqrt(c);
            double denominator = (a * b) + c;

            // 0-ზე გაყოფის შემოწმება
            if (denominator == 0) {
                System.out.println("Error: მნიშვნელი არ უნდა იყოს 0.");
                return;
            }

            double x = numerator / denominator;

            // დაიბეჭდოს შედეგი
            System.out.printf("შედეგი: %.4f\n", x);

            // Close the scanner
            scanner.close();
        }
    }
}