import java.util.Scanner;

class Add{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Add tow number : " + (num1 + num2));
        System.out.println("Subtract two number : " + (num1 - num2));
        System.out.println("Multi tow number : " + (num1 * num2));
        System.out.println("Dividt two number : " + (num1 / num2));
        System.out.println("Modulto tow number : " + (num1 % num2));
    }
}