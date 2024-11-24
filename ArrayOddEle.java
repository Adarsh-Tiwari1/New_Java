
import java.util.Scanner;

class ArrayOddEle{
    public static void main(String[] args){
         int arr[] = new int[5];
         Scanner sc = new Scanner(System.in);

         for(int i=0;i<arr.length;i++){
         System.out.println("Enter Element index of : " + i + " : ");
	     arr[i] = sc.nextInt();
         } // input

	     System.out.println("Length of the Array " + arr.length);
	     System.out.println("Enement of the Array :");
	     for(int i=0;i<=arr.length;i++){ // or use if statenment 
	     if(i%2!=0){
	     System.out.println(i + " Index Element " + arr[i]);
	    } // output   
	}   
    }
}