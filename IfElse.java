/*
import java.util.Scanner;

class IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Press For age");
        int num = sc.nextInt();
        if(num >= 18){
            System.out.println("You are Eligible");
        }else{
            System.out.println("For are Not Eligible");
        }
    }
}
*/


/*
import java.util.Scanner;

class IfElse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Press Character");
        char ch = sc.nextLine().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("This is vowel");
        }else{
            System.out.println("This si not Vowel");
        }
    }
}
*/

import java.util.Scanner;

class IfElse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Press For Choise");
        System.out.println("===========================================================");
        System.out.println("Press +  For Addition");
        System.out.println("Press - For Subtraction");
        System.out.println("Press * For Mutliplication");
        System.out.println("Press / For Division");
        System.out.println("===========================================================");

        int num = sc.next().charAt(0);
        System.out.println("===========================================================");
        System.out.println("Enter 1st Number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int num2 = sc.nextInt();
        System.out.println("===========================================================");

        if (num == '+') {
            System.out.println("Addition : " + num1 + num2);
        } else if(num == '-') {
            System.out.println("Subtraction : " + num1 -++ num2);
        }
    }
}
