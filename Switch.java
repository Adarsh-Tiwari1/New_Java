/*
import java.util.Scanner;

class Switch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Character :");
        char ch = sc.next().charAt(0);
                 // switch me dublicate case nahi de sakte hai
        switch(ch){
            case 'a':
                case 'A': // case me condition de sakte hai per constant hona chaiya , and logical Or ka use nahi kar sakte hai
                System.out.println("Is Is Vowel");
                break;
            case 'e':
                case 'E':
                System.out.println("Is Is Vowel");
                break;
            case 'i':
                case 'I':
                System.out.println("Is Is Vowel");
                break;
            case 'o':
                case 'O':
                System.out.println("Is Is Vowel");
                break;
            case 'u':
                case 'U';
                System.out.println("Is Is Vowel");
                break;
            default : 
            System.out.println("Not a Vowel");
        }
    }
}
*/

/*
import java.util.Scanner;

class Switch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch(num%2){
            case 0 :
                System.out.println("even number");
                break;
            case 1 :
                System.out.println("odd number");
                break;      // hum default ko kahi ve use kar sakte hai but break lagana compulasry hai
        }
    }
}
*/

/*
import java.util.Scanner;

class Switch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter :");
        char ch = sc.next().charAt(0);

        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();

        System.out.println("Enter 2st number");
        int num2 = sc.nextInt();

        switch(ch){
        case '+':
            System.out.println("Addition : " + (num1+num2));
            break;
            case '-':
            System.out.println("Subtraction : " + (num1-num2));
            break;
            case '*':
            System.out.println("Multiply : " + (num1*num2));
            break;
            case '/':
            System.out.println("Divide : " + (num1/num2));
            break;
            default:
                System.out.println("Please enter valid symbol");
        }        
    }
}
*/


import java.util.Scanner;

class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an operator (+, -, *, /):");
        char ch = sc.next().charAt(0);

        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();

        switch (ch) {
            case '+':
                System.out.println("Addition : " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction : " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiply : " + (num1 * num2));
                break;
            case '/':
                // To avoid division by zero
                if (num2 != 0) {
                    System.out.println("Divide : " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Please enter a valid symbol (+, -, *, /).");
        }
    }
}
