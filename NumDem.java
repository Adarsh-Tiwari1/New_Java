
import java.util.Scanner;

public class DivisionQuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Input denominator: ");
        int denominator = scanner.nextInt();

        if (denominator == 0) {
            System.out.println("Denominator cannot be zero. Please enter a valid denominator.");
        } else {

            int quotient = numerator / denominator;
            int remainder = numerator % denominator;

            System.out.println("quotient = " + quotient);
            System.out.println("remainder = " + remainder);
        }
    }
}
