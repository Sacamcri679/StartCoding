
import java.util.Scanner;

public class CalculateVAT {
    public static void main(String[] args) {

        final double vatRate = 12;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to be taxed: ");

        double salesTax = scanner.nextDouble();

        double result = calculateSalesTax(salesTax, vatRate);

        System.out.println("The sales tax is: " + result);

    }

    public static double calculateSalesTax(double salesTax, double vatRate){

        return salesTax * vatRate / 100;
    }

    // Your Task - Write a program that returns the sales tax for an input amount.
    // The VAT is considered 12%.
}
