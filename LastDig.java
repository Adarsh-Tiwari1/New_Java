import java.util.Scanner;

class LastDig{
	public static void main(String[] args){
	int n,last;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number :");
	n = sc.nextInt();

	last = n%10;
	
	System.out.println("Last digit of the number : " + last);
	System.out.println("Number except last digit : " + (n/10));
	}
}
	