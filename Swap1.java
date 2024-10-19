
class Swap1{
	public static void main(String[] args){
	int a,b,c;
	
	a = 50;
	b = 100;	
	
	System.out.println("Before Swappint");
	System.out.println("a : " + a + " " + "b : " + b);

	a = a + b;
	b = a - b;
	a = a -b;
	

	System.out.println("Afer Swappint");
	System.out.println( "a :" +  a + " " + "b :" + b);
	}
}