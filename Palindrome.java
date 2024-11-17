// Palindrome : 121 : same foword and backword


import java.util.Scanner;

class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number");
        int num = sc.nextInt();

        int m = num;
        int res = 0;
        while(num!=0){
            int r = num%10;
            res = res*10+r;
            num = num/10;
        }
        if(m==res){
            System.out.println("This is Palindrome num");
        }else{
            System.out.println("This is not Palindrome num");
        }
    }
}