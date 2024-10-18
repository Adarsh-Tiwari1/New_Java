
import java.util.Scanner;

public class KiloToMile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input kilometers per hour : ");
        float kiloMeterPerHour = sc.nextFloat();

        float milesPerHour = kiloMeterPerHour * 0.621371f;

        System.out.println(kiloMeterPerHour + " kilometers per hour is " + milesPerHour + " miles per hour.");
    }
}
