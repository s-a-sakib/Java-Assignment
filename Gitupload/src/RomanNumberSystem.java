import java.util.Scanner;

public class RomanNumberSystem {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please input the number: ");
        int number = read.nextInt();
        RomanNumberConvertor romanNumberConvertor = new RomanNumberConvertor();
        romanNumberConvertor.intToRoman(number);
    }
}