
import java.util.Scanner;
class InputClass1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        float num3 = sc.nextFloat();
        System.out.println( num1 + num2 - num3);
    }
}