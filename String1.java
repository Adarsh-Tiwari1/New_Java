/*
class String1{
    public static void main(String[] args){
        String s = new String();
        System.out.println();
        String s1 = new String("Adarsh");
        System.out.println(s1);
        char ch[] = {'w','e','l','c','o','m','e'};
        String s2 = new String(ch);
        System.out.println(ch);
        String s3 = new String(ch,2,5);
        System.out.println(s3);
        byte b1[] = {66,67,68,69,70};
        String e = new String(b1,0,3);
        System.out.println(e);
        String f = "Welcome to Bhopal";
        System.out.println(f);
    }
}
*/


// String class Method 

// charAt();
/*
import java.util.Scanner;

class String1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Any String");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
*/

// Reverse String
/*
import java.util.Scanner;

class String1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Any String");
        String str = sc.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
*/

// compareTo() method
/*
class String1{
    public static void main(String[] args){
        String str1 = "A";
        String str2 = "a";
        int result = str1.compareTo(str2);
        System.out.println(result);
    }
}
*/

/*
class String1{
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "Hello";
        int result = str1.compareTo(str2);
        System.out.println(result);
    }
}
*/


/*
import java.util.Scanner;

class String1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String str1 = sc.nextLine();
        System.out.println("Enter String 2 : ");
        String str2 = sc.nextLine();
        int result = str1.compareTo(str2);

        if(result > 0){
            System.out.println(str1 + " is Greater");
        }else if(result < 0){
            System.out.println(str2 + " Is Greater");
        }else if(result == 0){
            System.out.println(str1 + " and " + str2 + " Are Equal");
        }
    }
}
*/


// String concate

class String1{
    public static void main(String[] args){
        String str1 = "Soft";
        String str2 = "Ware";
        String str3 = "SoftWate";
        String result = str1+str2;
        System.out.println(result);
        System.out.println(str3 == result);
        System.out.println(str3.compareTo(result));
    }
}









































































/*
class String1 {
    public static void main(String[] args) {
        String s = "sattu";
        s = s.toUpperCase();  
        System.out.println(s); 
    }
}
*/
