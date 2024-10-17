import java.util.Scanner;

class SumTwoNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum of two number : " + ( num1 + num2 ));
    }
}