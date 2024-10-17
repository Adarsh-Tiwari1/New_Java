
import java.util.Scanner;

public class CentToFah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Centigrade: ");
        float cent = sc.nextInt();

        float fahre = (cent * 9/5) + 32;

        System.out.println("Temperature To Fahrenheit: " + fahre);
    }
}
