// smallest element in the array.
//. Aarray me index size aur size negative nahi hoti hai
/*
class Array3{
    public static void main(String[] args){
        int arr[] = {10,20,62,0};
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
*/

// find max value in array 
/*
class Array3{
    public static void main(String[] args){
        int arr[] = {10,20,62,0,-2,66};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest element : " +  max);
    }
}
*/

// Find Seconde Gratest Number
/*
import java.util.Scanner;

class Array3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[7];
        int FirstMax = arr[0];
        int SecondMax = arr[0];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter Element : " + i + " :");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>FirstMax){
                SecondMax=FirstMax;
                FirstMax=arr[i];
            }else if(arr[i]>SecondMax && arr[i]!=FirstMax){
                SecondMax=arr[i];
            }
        }
        System.out.println("***********************************************************************");
        System.out.println("First max : " + FirstMax);
        System.out.println("First max : " + SecondMax);
    }
}
*/

// wap to check given array is sorted or not 

/*
class Array3{
    public static void main(String[] args){
        int arr[] = {10,40,20,30};
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        } 
        if(count==0){
            System.out.println("yes array element is sorted");
        }else{
            System.out.println("not array element is sorted");
        }
    }
}
*/


