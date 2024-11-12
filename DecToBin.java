
import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Decimal to binary conversion
        String binary = Integer.toBinaryString(number);
        
        System.out.println("Binary representation of " + number + " is: " + binary);
        
    }
}

// Integer.toOctalString()
// Integer.toHexString()
