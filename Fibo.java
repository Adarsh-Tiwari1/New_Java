/*
import java.util.Scanner;

class Fibo{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int t1,t2,t3;
        t1 = 0;
        t2 = 1;
        System.out.print(t1 + "\t" + t2);
        for(int i=3;i<=num;i++){
            t3 = t1+t2;
            System.out.print("\t" + t3);
            t1=t2;
            t2=t3;
        }
    }
}
*/

import java.util.Scanner;

class Fibo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int t1,t2,t3; // 0,1,1,2,3,5,8,13 ...
        t1=0; // 1 
        t2=1; // 1
        System.out.print(t1+" "+t2 + "\t"); // 0 1 1 
        for(int i=3;i<=num;i++){  // 10
            t3=t2+t1; // 1
            System.out.print( t3 + "\t ");
            t1=t2;
            t2=t3;
        }
    }
}