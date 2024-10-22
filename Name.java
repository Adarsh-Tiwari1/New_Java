import java.util.Scanner;

class Name{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name : ");
	String name = sc.nextLine();

	System.out.println("Enter your Section : ");
	char ch = sc.next().charAt(0);

	System.out.println("Your name is : " + name);
	System.out.println("Your section : " + ch);
	}
}