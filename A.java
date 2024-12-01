

import java.util.Scanner;

class A{
    public static void main(String[] ares){
        int arr[][] = new int[1][5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Element Index 00: ");
        arr[0][0] = sc.nextInt();
        System.out.println("Enter Element Index 01: ");
        arr[0][1] = sc.nextInt();
        System.out.println("Enter Element Index 02: ");
        arr[0][2] = sc.nextInt();
        System.out.println("Enter Element Index 03: ");
        arr[0][3] = sc.nextInt();
        System.out.println("Enter Element Index 04: ");
        arr[0][4] = sc.nextInt();

        System.out.println("Enter Element Index 10: ");
        arr[1][0] = sc.nextInt();
        System.out.println("Enter Element Index 11: ");
        arr[1][1] = sc.nextInt();
        System.out.println("Enter Element Index 12: ");
        arr[1][2] = sc.nextInt();
        System.out.println("Enter Element Index 13: ");
        arr[1][3] = sc.nextInt();
        System.out.println("Enter Element Index 14: ");
        arr[1][4] = sc.nextInt();
        

        System.out.print(arr[0][0],arr[0][1],arr[0][2],arr[0][3],arr[0][4]);
        System.out.println(arr[1][0],arr[1][1],arr[1][2],arr[1][3],arr[1][4]);
    }
}