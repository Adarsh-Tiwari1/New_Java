/*
import java.util.Scanner;

class ElseIf{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Character");
        char ch = sc.nextLine().charAt(0);

        if(ch >= '0' && ch<= '9'){
            System.out.println("Digit");
        }else if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lower case");
        }else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Upper Case");
        }else{
            System.out.println("Special Character");
        }
    }
}
*/

import java.util.Scanner;

class ElseIf{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Subject Marks");
        int num = sc.nextInt();

        if (num >= 90){
            System.out.println("A Gread");
        }else if (num >= 80 && num <= 89){
            System.out.println("B Gread");
        }else if (num >= 70 && num <= 79){
            System.out.println("C Gread");
        }else if (num >= 60 && num <= 69){
            System.out.println("D Gread");
        }else{
            System.out.println("F Gread");
        }
    }
}