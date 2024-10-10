package Task_4;

import java.util.Scanner;

    class Currency_Exchange_With_Fees {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ჩაწერე გადასახდელი ვალუტა, გაცვლის კურსი, მისაღები ვალუტა
        System.out.print("ჩაწერე გადასახდელი ვალუტა: ");
        double Amount = scanner.nextDouble();

        System.out.print("ჩაწერე გაცვლითი კურსი: ");
        double Exchange = scanner.nextDouble();

        System.out.print("ჩაწერე მისაღები ვალუტა: ");
        double Fee = scanner.nextDouble();

        // გაცვლითი კალკულატორი
        double EUR = Amount * Exchange * (1-(Fee/100));


        // დაბეჭდე შედეგი
        System.out.printf("EUR Received: %.2f\n", EUR);

        // Close the scanner
        scanner.close();
    }
}