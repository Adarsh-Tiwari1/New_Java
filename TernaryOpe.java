import java.util.Scanner;

class TernaryOpe{
    public static void main(String[] args){
        int num;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        num = sc.nextInt();

        result = num > 0 ? " Positive Number " : " Negative Number ";
        System.out.println(result);
    }
}