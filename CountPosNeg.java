
import java.util.Scanner;

public class CountPositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;

        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();
        System.out.print("Input the fourth number: ");
        int num4 = scanner.nextInt();
        System.out.print("Input the fifth number: ");
        int num5 = scanner.nextInt();

        if (num1 > 0) positiveCount++;
        if (num1 < 0) negativeCount++;

        if (num2 > 0) positiveCount++;
        if (num2 < 0) negativeCount++;

        if (num3 > 0) positiveCount++;
        if (num3 < 0) negativeCount++;

        if (num4 > 0) positiveCount++;
        if (num4 < 0) negativeCount++;

        if (num5 > 0) positiveCount++;
        if (num5 < 0) negativeCount++;

        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
    }
}
