
import java.util.Scanner;

class EvenOdd{
    public static void main(String[] args){
        int num;
        String result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number");
        num = sc.nextInt();

        result = num % 2 == 0 ? " This Number is Even " : " This Number is Odd ";
        System.out.println(result); 
    }
}