/*
import java.util.Scanner;

class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();

        if(num > 0){
        System.out.println(num + " is Positive");
        } else if(num < 0){
        System.out.println(num + " is Negative");
        } else {
            System.out.println(num + " : You Enter Zero Number");
        }
    }
}
*/


/*
import java.util.Scanner;

class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2st Number");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " : is Greater");
        } else {
            System.out.println(num2 + " : is Greater");
        }
    }
}
*/


/*
import java.util.Scanner;

class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        int num1 = sc.nextInt();

        if(num1 % 2 == 0) {
            System.out.println(num1 + " : is Even");
        } else {
            System.out.println(num1 + " : is Odd");
        }
    }
}
*/


/*
import java.util.Scanner;

class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2st Number");
        int num2 = sc.nextInt();

        int result = num1 + num2;
        System.out.println("Total sum " + result);

        if(result % 2 == 0) {
            System.out.println(result + " : is Even");
        } else {
            System.out.println(result + " : is Odd");
        }
    }
}
*/


/*
import java.util.Scanner;

class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2st Number");
        int num2 = sc.nextInt();
        System.out.println("Enter 3st Number");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " : is Greater");
        } else if (num1 < num2 && num3 < num2){
            System.out.println(num2 + " : is Greater");
        }
        else {
            System.out.println(num3 + " : is Greater");
        }
    }
}
*/


/*
import java.util.Scanner;

class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        float num = sc.nextFloat();

        if(num == 0.0){
            System.out.println("Number is Zero");
        } else if (num > 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }
    }
}
*/


/*
import java.util.Scanner;

class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        float num1 = sc.nextFloat();
        System.out.println("Enter 2nd Number");
        float num2 = sc.nextFloat();

        if(num1 == num2){
            System.out.println("Same Number");
        } 
        else {
            System.out.println("Different Number");
        }
    }
}
*/

/* *** 4, 5,9, 8
import java.util.Scanner;

class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("This Character is Vowel");
        }else if
    }
}
*/


/*
import java.util.Scanner;

class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("This is Leap Year");
        } else {
            System.out.println("This is not Leap Year");
        }
    }
}
*/


/*
import java.util.Scanner;

class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2st Number");
        int num2 = sc.nextInt();
        System.out.println("Enter 3st Number");
        int num3 = sc.nextInt();
        System.out.println("Enter 4st Number");
        int num4 = sc.nextInt();
        System.out.println("Enter 5st Number");
        int num5 = sc.nextInt();

        int result = num1 + num2 + num3 + num4 + num5;
        float average = result / 5;

        System.out.println("Total sum : " + result);
        System.out.println("Average : " + average);
    }
}
*/

/*
import java.util.Scanner;

class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = sc.nextInt();
        int i=0;

        // for( i=1;i<=num;i++){
        // //    System.out.print(i);
    
        // }  
         for(int j=1; j<=num*2; j++)
            {
            if(j%2!=0){
                System.out.println(j);
            }
            }
    }
}
*/