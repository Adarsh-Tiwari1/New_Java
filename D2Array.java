/*
class D2Array{
    public static void main(String[] ares){
        int arr[][] = new int[3][3];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;

        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;

        arr[2][0] = 70;
        arr[2][1] = 80;
        arr[2][2] = 90;

        System.out.println(arr[0][0] + "\t" + arr[0][1] + "\t" + arr[0][2]);
        System.out.println(arr[1][0] + "\t" + arr[1][1] + "\t" + arr[1][2]);
        System.out.println(arr[2][0] + "\t" + arr[2][1] + "\t" + arr[2][2]);
    }
}
*/

/*
import java.util.Scanner;

class D2Array{
    public static void main(String[] ares){
        int arr[][] = new int[2][5];
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

        System.out.println(arr[0][0],arr[0][1],arr[0][2],arr[0][3],arr[0][4]);
        System.out.println(arr[1][0],arr[1][1],arr[1][2],arr[1][3],arr[1][4]);
    }
}
*/

/*
import java.util.Scanner;

class D2Array{
    public static void main(String[] ares){
        int arr[][] = new int[2][5];
        int r,c;
        Scanner sc = new Scanner(System.in);
        for(r=0;r<arr.length;r++){
            for(c=0;c<arr[r].length;c++){
                System.out.println("Enter Element of Index " + r+c+" : ");
                arr[r][c]=sc.nextInt();
            }
        }
        System.out.println("Output  of 2D Array :");
        for(r=0;r<arr.length;r++){
            for(c=0;c<arr[r].length;c++){
                System.out.print(" "+arr[r][c]);
            }
            System.out.println("");
        }
    }
}
*/


/*
class D2Array{
    public static void main(String[] ares){
        int arr[][] = {
            {1,2,3},
            {1,2},
            {1}
        };
        System.out.println(arr[0][0] + "\t" + arr[0][1] + "\t" + arr[0][2]);
        System.out.println(arr[1][0] + "\t" + arr[1][1]);
        System.out.println(arr[2][0]);
    }
}
*/

/*
class D2Array2{
    public static void main(String[] ares){
        int arr[][] = {
            {0,0,0,0},
            {0,1,0},
            {1,0,0}
        };
        System.out.println(arr[0][0] + " " + arr[0][1]);
    }
}
*/