/*
import java.util.Scanner;

class Loop2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=num;i>=1;i--){
            fact = fact * i;
        }
        System.out.println("Factorial is given number : " + fact);
    }
}
*/

// wap to print sum of digit of the given number 

import java.util.Scanner;

class Loop2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();
        int sum = 0;
        while(num!=0){
            int r = num % 10; 
            sum = sum + r;

            num = num / 10;
        }
        System.out.println(" Sum of Digit : " + sum);
    }
}