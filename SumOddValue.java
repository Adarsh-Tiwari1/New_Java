
import java.util.Scanner;

public class SumOddValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

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

        if (num1 % 2 != 0) sum += num1;
        if (num2 % 2 != 0) sum += num2;
        if (num3 % 2 != 0) sum += num3;
        if (num4 % 2 != 0) sum += num4;
        if (num5 % 2 != 0) sum += num5;

        System.out.println("Sum of all odd values: " + sum);
    }
}
