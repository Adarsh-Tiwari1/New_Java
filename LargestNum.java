import java.util.Scanner;

class LargestNum{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();

        String result = num == 0 ? " Num are Zero " : num > 0 ? " Num is Positive" : " Num is Negative";
        
        System.out.println(result);
    }
}