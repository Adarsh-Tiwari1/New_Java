import java.util.Scanner;

class Devide{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Devide two number : " + (num1 / num2));
    }
}