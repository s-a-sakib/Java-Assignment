import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("If you are married then type (Yes) else type (No)");
        String s = read.nextLine();
        System.out.println("Please input your taxable income  : ");
        double amount = read.nextDouble();
        TaxCalculator taxCalculator = new TaxCalculator(s,amount);
        System.out.printf("You have to pay  %.2f $ taxes",taxCalculator.getPayAbleAmount());
    }
}