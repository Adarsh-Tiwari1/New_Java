
import java.util.Scanner;

public class CountAndAveragePositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        double positiveSum = 0;

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

        if (num1 > 0) {
            positiveCount++;
            positiveSum += num1;
        }
        if (num2 > 0) {
            positiveCount++;
            positiveSum += num2;
        }
        if (num3 > 0) {
            positiveCount++;
            positiveSum += num3;
        }
        if (num4 > 0) {
            positiveCount++;
            positiveSum += num4;
        }
        if (num5 > 0) {
            positiveCount++;
            positiveSum += num5;
        }

        double average = (positiveCount > 0) ? (positiveSum / positiveCount) : 0;

        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.printf("Average value of the said positive numbers: %.2f%n", average);
    }
}
