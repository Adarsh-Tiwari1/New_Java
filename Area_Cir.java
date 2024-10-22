import java.util.Scanner;

class Area_Cir{
	public static void main(String[] args){
	float r,ar,cr;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Radius : ");
	r=sc.nextFloat();
	ar=3.14f*r*r;
	cr=2*3.14f*r;
	
	System.out.println(" Area : " + ar);
	System.out.println(" Circumference of circle : " + cr);
	}
}
	