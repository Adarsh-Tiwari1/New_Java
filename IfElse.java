
import java.util.Scanner;

class IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int num = sc.nextInt();
        if(num >= 18){
            System.out.println("You are Eligible");
        }else{
            System.out.println("Your are Not Eligible");
        }
    }
}