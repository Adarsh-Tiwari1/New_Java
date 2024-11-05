
/*
import java.util Scanner;

class LargestNum1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();

        String result = num1 == num2 ? " Number are Equal " : num1 == 0 &&  num2 == 0 ? " Both number are equal to Zero " :  " Num1 or Num2 is Greater ";

        System.out.println(result);
    }
}
*/


import java.util.Scanner;

class LargestNum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();

      //  String result = (num1 == 0 && num2 == 0) ? "Both numbers are equal to zero" : (num1 == num2) ? "Numbers are equal" : (num1 > num2) ? "Num1 is greater" : "Num2 is greater";

        String result = (num1==0 && num2==0) ? "Num are Zero" : (num1==num2) ? "Num is equal" : (num1>num2) ? " num1 great" : (num1<0 && num2<0) ? "num negat" : "Num2 is great";


        System.out.println(result);
    }
}
