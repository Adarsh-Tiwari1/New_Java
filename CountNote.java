import java.util.Scanner;

class CountNote{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Money");
        int totalNote = sc.nextInt();

        int a = totalNote/100;
        System.out.println("Total rs:100 note : " + a);
        int rem = totalNote-(a*100);

        a = rem/50;
        System.out.println("Total rs:50 note : " + a);
        rem = rem-(a*50);

        a = rem/20;
        System.out.println("Total rs: 20 note : " + a);
    }
}