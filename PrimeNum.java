// Smallest Prime Num = 2

import java.util.Scanner;

class PrimeNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int num  = sc.nextInt();
        int count = 0;

        for(int i=1;i<=num;i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("This is Prime Number");
        }else {
            System.out.println("This is Not Prime Number");
        }
    }
}