
class Swap2{
	public static void main(String[] args){
	int a,b,c;
	
	a = 100;
	b = 200;	
	
	System.out.println("Before Swappint");
	System.out.println("a : " + a + " " + "b : " + b);

	a = a * b;
	b = a/b;
	a = a/b;
	

	System.out.println("Afer Swappint");
	System.out.println( "a :" +  a + " " + "b :" + b);
	}
}