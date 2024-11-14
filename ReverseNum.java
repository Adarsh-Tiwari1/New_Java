
import java.util.Scanner;

class ReverseNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any Number");
        int num = sc.nextInt();

        int res = 0;
        while(num!=0){
            int r = num%10;
            res = res*10+r;
            num = num/10;
        }
        System.out.println("Reverse NO : " + res);
    }
}