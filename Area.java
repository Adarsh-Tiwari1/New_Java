
class Area{
	public static void main(String[] args){
	java.util.Scanner obj = new java.util.Scanner(System.in);  // this is inline import
	 
	float r,ar,cr;

	System.out.println("Enter Radius : " );
	r = obj.nextFloat();

	ar=3.14f*r*r;
	cr=2*3.14f*r;

	System.out.println("Area : " + ar);
	System.out.println("Cir : " + cr);
	}
}+