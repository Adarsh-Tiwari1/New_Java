
import java.util.Scanner;

public class HorMinSec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total Second");
        int totalSecond = sc.nextInt();
        int h = totalSecond/3600;
        int rem = totalSecond%3600;
        int m = rem/60;
        int s = rem%60;
        System.out.println(h);
        System.out.println(m);
        System.out.println(s);
    }
}