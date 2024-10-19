
import java.util.Scanner;

class LastSecondDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int LastSecond = sc.nextInt();
        int Last = LastSecond/10%10;
        System.out.println("Last Second digit : " + Last);
    }
}
