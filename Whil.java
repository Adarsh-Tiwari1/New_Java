
import java.util.Scanner;

class Whil{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int count = 0;
        while(num1 !=0 && num2 !=0){
            if(num1 < num2){
                num2 = num2-num1;
            }else {
                num1 = num1 - num2;
            }
            count++;
        }
        System.out.println(count);
        
    }
}