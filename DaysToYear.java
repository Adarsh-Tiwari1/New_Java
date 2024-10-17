
import java.util.Scanner;

class DaysToYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input days: ");
        int totalDay = sc.nextInt();

        int year = totalDay / 365;
        int rem = totalDay % 365;
        int month = rem / 30;
        int day = rem % 30;

        System.out.println( "Total Year : " + year );
        System.out.println( "Total Year : " + month );
        System.out.println( "Total Year : " + day );
    }
}
