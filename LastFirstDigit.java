
import java.util.Scanner;

class LastFirstDigit{
	public static void main(String[] args){
	Scanner obj = new Scanner(System.in);
    System.out.println("Enter number");
	System.out.println("Enter ant number : ");
	int n = obj.nextInt();
	 
	int last = n%10;
	System.out.println("Last digit : " + last);
	}
}