// length is property .

/*
class Array1{
    public static void main(String[] args){
         int arr[] = {10,20,30,40,50,0};
         // int arr[] = new int[]{10,20,30,40,50,0};
         System.out.println("Length of the Array " + arr.length);
         System.out.println(arr[arr.length-1]);
	     System.out.println("Array at index 0 : " + arr[0]);
	     System.out.println("Array at index 1 : " + arr[1]);
	     System.out.println("Array at index 2 : " + arr[2]);
	     System.out.println("Array at index 3 : " + arr[3]);
	     System.out.println("Array at index 4 : " + arr[4]);
	     System.out.println("Array at index 4 : " + arr[5]);
    }
}
*/

/*
import java.util.Scanner;

class Array1{
    public static void main(String[] args){
         int arr[] = new int[5];
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter Element Index of 0 : ");
         arr[0] = sc.nextInt();
         System.out.println("Enter Element Index of 1 : ");
         arr[1] = sc.nextInt();
         System.out.println("Enter Element Index of 2 : ");
         arr[2] = sc.nextInt();
         System.out.println("Enter Element Index of 3 : ");
         arr[3] = sc.nextInt();
         System.out.println("Enter Element Index of 4 : ");
         arr[4] = sc.nextInt();

         System.out.println("Length of the Array : " + arr.length);

         System.out.println(arr[0]);
         System.out.println(arr[1]);
         System.out.println(arr[2]);
         System.out.println(arr[3]);
         System.out.println(arr[4]);
    }
}
*/


// length is property .

/*
class Array1{
    public static void main(String[] args){
         int arr[] = {10,20,30,40,50,0};
         // int arr[] = new int[]{10,20,30,40,50,0};
         System.out.println("Length of the Array " + arr.length);
         System.out.println(arr[arr.length-1]);
	     System.out.println("Array at index 0 : " + arr[0]);
	     System.out.println("Array at index 1 : " + arr[1]);
	     System.out.println("Array at index 2 : " + arr[2]);
	     System.out.println("Array at index 3 : " + arr[3]);
	     System.out.println("Array at index 4 : " + arr[4]);
	     System.out.println("Array at index 4 : " + arr[5]);
    }
}
*/

/*
import java.util.Scanner;

class Array1{
    public static void main(String[] args){
         int arr[] = new int[5];
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter Element Index of 0 : ");
         arr[0] = sc.nextInt();
         System.out.println("Enter Element Index of 1 : ");
         arr[1] = sc.nextInt();
         System.out.println("Enter Element Index of 2 : ");
         arr[2] = sc.nextInt();
         System.out.println("Enter Element Index of 3 : ");
         arr[3] = sc.nextInt();
         System.out.println("Enter Element Index of 4 : ");
         arr[4] = sc.nextInt();

         System.out.println("Length of the Array : " + arr.length);

         System.out.println(arr[0]);
         System.out.println(arr[1]);
         System.out.println(arr[2]);
         System.out.println(arr[3]);
         System.out.println(arr[4]);
    }
}
*/

/*
import java.util.Scanner;

class Array1{
    public static void main(String[] args){
         int arr[] = new int[5];
         Scanner sc = new Scanner(System.in);

         for(int i=0;i<arr.length;i++){
         System.out.println("Enter Element index of : " + i + " : ");
	     arr[i] = sc.nextInt();
         } // input

	     System.out.println("Length of the Array " + arr.length);
	     System.out.println("Enement of the Array :");
	     for(int i=0;i<arr.length;i++){
	     System.out.println(i + " Index Element " + arr[i]);
	    } // output      
    }
}
*/


// wap to print reverse of the array element ? 

/*
import java.util.Scanner;

class Array1{
    public static void main(String[] args){
         int arr[] = new int[5];
         Scanner sc = new Scanner(System.in);

         for(int i=0;i<arr.length;i++){
         System.out.println("Enter Element index of : " + i + " : ");
	     arr[i] = sc.nextInt();
         } // input

	     System.out.println("Length of the Array " + arr.length);
	     System.out.println("Enement of the Array :");
	     for(int i=arr.length-1;i>=0;i--){
	     System.out.println(i + " Index Element " + arr[i]);
	    } // output      
    }
}
*/

// wap to print alternet array element 

/*
import java.util.Scanner;

class Array1{
    public static void main(String[] args){
         int arr[] = new int[5];
         Scanner sc = new Scanner(System.in);

         for(int i=0;i<arr.length;i++){
         System.out.println("Enter Element index of : " + i + " : ");
	     arr[i] = sc.nextInt();
         } // input

	     System.out.println("Length of the Array " + arr.length);
	     System.out.println("Enement of the Array :");
	     for(int i=0;i<=arr.length;i=i+2){
	     System.out.println(i + " Index Element " + arr[i]);
	    } // output      
    }
}
*/

// print odd element 

/*
import java.util.Scanner;

class Array1{
    public static void main(String[] args){
         int arr[] = new int[5];
         Scanner sc = new Scanner(System.in);

         for(int i=0;i<arr.length;i++){
         System.out.println("Enter Element index of : " + i + " : ");
	     arr[i] = sc.nextInt();
         } // input

	     System.out.println("Length of the Array " + arr.length);
	     System.out.println("Enement of the Array :");
	     for(int i=0;i<=arr.length;i=i+2){ // or use if statenment 
	     System.out.println(i + " Index Element " + arr[i]);
	    } // output      
    }
}
*/

// Sum of all element in array

import java.util.Scanner;

class Array1{
    public static void main(String[] args){
         int arr[] = new int[5];
         Scanner sc = new Scanner(System.in);
         int sum = 0;

         for(int i=0;i<arr.length;i++){
         System.out.println("Enter Element index of : " + i + " : ");
	     arr[i] = sc.nextInt();
         } // input

	     System.out.println("Length of the Array " + arr.length);
	     System.out.println("Enement of the Array :");
	     for(int i=0;i<=arr.length;i++){ // or use if statenment 
	     sum = sum + arr[i];
	     System.out.println(i + " Index Element " + arr[i]);
	    // output   
	}   
    System.out.println("Sum of All array elements : " + sum);
    }
}