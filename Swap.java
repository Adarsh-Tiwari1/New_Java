class Swap{
	public static void main(String[] args){
	int a=10,b=20,c;
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("Before swappint : " + " a " + a + "b : " + b );
	
	System.out.println("After swappint : " +  " a " + a + "b : " + b);
	}
}