/*
class String4{
    public static void main(String[] args){
        String str = "Welcome";
        char[] arr = {'w','e','l','c','o','m','e'};
        for(char x:arr){
            System.out.println(x);
        } 
    }
}
*/

/*
class String4{
    public static void main(String[] args){
        
        int[] num = {10,20,30,40,50};
        int sum = 0;
        for(int x:num){
            sum = sum + x;
        } 
        System.out.println(x);
    }
}
*/

// toUpperCase() 
/*
import java.util.Scanner;
class String4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any String :");
        String str = sc.nextLine();
        String resutl = str.toUpperCase();
        System.out.println(resutl);
    }
}
*/


// toString() method : it is use to convert any object into String 
// int x = 10; : x is variable 
// Integer y = 12; : Y is an object

/*
class String4{
    public static void main(String[] args){
        Integer num = 1234; // Only Allow Object
        int num1 = 12345;
        String str = num.toString(); // Allow
        String str1 = num1.toString(); // Not Allow
        System.out.println(str.length());
        System.out.println(str1.length()); // Not Allow
    }
}
*/

/*
class String4{
    public static void main(String[] args){
        int[] arr = {10,20,30};
       System.out.println(arr); // Print Address 
    }
}
*/

// valueOf() : 

class String4{
    public static void main(String[] args){
        int num = 1234;
        String str = String.valueOf(num);
        System.out.println(str.length());  

        float num1 = 33.44f;
        String str1 = String.valueOf(num1); 
        System.out.println(str1.length()); 

        
    }
}



// wap to check given upper case of not . ex. enter any string : WELCOME : true

// wap to convert given sentence into title case  : Ea. enter any string : welCome TO bhopAL this Is The CIty of Lake : resutl : Welcome TO Bhopal Thsi Is The City Of Bhopal

// String gigle case or not : true 