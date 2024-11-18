
import java.util.Scanner;

class Hii{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int count=0;
        int num = sc.nextInt();
        while(num>0)
        {
            int rem=num%10;
            num=num/10;
            if(rem==3 || num==3)
            {
                count++;
                break;
            }

        }
                    if(count!=0)
            {
                System.out.println("yes");
            }
            else{
               System.out.println("No"); 
            }
    }
}