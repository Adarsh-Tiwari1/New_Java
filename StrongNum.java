// StrongNum / krishnmurthy number : sum of the factorial of its digits equal to the number itself : 145 - 1! + 4! + 5! = 1 + 24 + 120 = 124

import java.util.Scanner;

class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            num /= 10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is a Strong Number.");
        } else {
            System.out.println(originalNum + " is not a Strong Number.");
        }
    }
}
