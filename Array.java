// Compoler only Syntax Check karta hai. logic check nahi karta hai.
/*
class Array{
    public static void main(String[] args) {
        int arr[] = new int[0];
    }
}
*/

/*
class Array{
    public static void main(String[] args) {
        int arr[] = new int[0];
        arr[0] = 10;
    }
}
*/

/*
class Array{
    public static void main(String[] args) {
        int arr[] = new int[(int)2.5]; // type casting 
    }
}
*/

/*
class Array{
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(arr); // Array Base Address .
    }
}
*/

/*
class Array{
    public static void main(String[] args) {
        int arr[] = new int[5]; // Compile Done , But Throw Exception 
        System.out.println(arr[6]);
    }
}
*/

/*
class Array{
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
}
*/


class Array{
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 101;
        arr[1] = 102;
        arr[2] = 555;
        arr[3] = 222;
        arr[4] = 888;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
	}
}