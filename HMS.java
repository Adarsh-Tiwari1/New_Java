import java.util.Scanner;

public class HMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input seconds: ");
        int totalSeconds = sc.nextInt();

        int hour = totalSeconds / 3600;
        int rem = totalSeconds % 3600;
        int minute = rem / 60;
        int second = rem % 60;

        System.out.println("Result :");
        System.out.println("Total hours : " + hour);
        System.out.println("Total minutes : " + minute);
        System.out.println("Total Second : " + second);
    }
}
