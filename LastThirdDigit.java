
import java.util.Scanner;

class LastThirdDigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int thirdDigit = sc.nextInt(); 
        int third = thirdDigit/100%10;
        System.out.println("Last Third Digit : " + third);
    }
}



