// StrongNum / krishnmurthy number : sum of the factorial of its digits equal to the number itself : 145 - 1! + 4! + 5! = 1 + 24 + 120 = 124

import java.util.Scanner;

class StrongNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number");
        int num = sc.nextInt();

        int m = num;
        int res = 0;
        int fact;
        while(num!=0){
            int r = num%10;
            res = res*10+r;
            fact = 1;
            for(int i=r;i>=1;i--){
                fact = fact*i
            }
        }
        if(m==res){
            System.out.println("This is Palindrome num");
        }else{
            System.out.println("This is not Palindrome num");
        }
    }
}