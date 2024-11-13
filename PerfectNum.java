
// Perfect Number : a perfect number is a positive number that is equal to the sum of its proper divisor (exccludint itself).
// ex. 6 : 1 + 2 + 3

import java.util.Scanner;

class PerfectNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number : ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1;i<num;i++){
            if(num%i==0){
                sum = sum+i;
            }
        } if(num == sum){
        System.out.println("This is perfect Number : "  );
        }else{
        System.out.println("This is not a perfect Number : " );
        }
       
    }
}