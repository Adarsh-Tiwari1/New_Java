class Swap{
	public static void main(String[] args){
	int a,b,c;
	
	a = 10;
	b = 20;	
	
	System.out.println("Before Swappint");
	System.out.println("a : " + a + " " + "b : " + b);

	c = b;
	b = a;
	a = c;
	

	System.out.println("Afer Swappint");
	System.out.println( "a :" +  a + " " + "b :" + b);
	}
    }