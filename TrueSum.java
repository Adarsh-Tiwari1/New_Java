
import java.util.Scanner;

public class CheckIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Input the second integer: ");
        int num2 = scanner.nextInt();

        boolean result = (num1 == 30 || num2 == 30 || (num1 + num2) == 30);

        System.out.println(result);
    }
}
