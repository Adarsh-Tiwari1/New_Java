import java.util.Scanner;

class VotingEli{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age : ");
        int age = sc.nextInt();

        String result = age >= 18 ? " You are Eligible for voting " : " You are Not Eligible ";

        System.out.println(result);

    }
}