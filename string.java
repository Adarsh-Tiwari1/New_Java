/*
class string{
    public static void main(String[] args){
        String str = "Adarsh Kumar Tiwari";
        System.out.println(str.length());
    }
}
*/

/*
class string{
    public static void main(String[] args){
        String str = "Adarsh Kumar Tiwari";
        for(int i=0;i<str.length();i++){
            System.out.println(str);
        }
    }
}
*/

/*
class string{
    public static void main(String[] args){
        char[] ch = {'a','d','a','r','s','h'};
        for(int i=0;i<ch.length;i++){
            System.out.println(ch);
        }
        // System.out.println(ch);
    }
}
*/

/*
class string{
    public static void main(String[] args){
        char[] ch = {'r','a','m'};
        String str = new String(ch); // convert char to String
        System.out.println(str);
    }
}
*/

/*
class string {
    public static void main(String[] args) {
        char[] ch = {'r', 'a', 'm'};
        // Convert the portion of the char array to a String
        System.out.println(new String(ch, 1, 2)); // Prints "am"
    }
}
*/

/*
class string {
    public static void main(String[] args){
        char[] ch = {'a','d','a','r','s','h'};
        String str = new String(ch,1,5);
        System.out.println(str);
    }
}
*/

/*
class string{
    public static void main(String[] args){
        int[] arr = {66,67,68,69,70};
        String str = new String(arr,1,3);
        System.out.println(str);
    }
}
*/

/*
class string{
    public static void main(String[] args){
        String[] str = {"ram","Sita","Radha","Krishna"};
        // System.out.println(str);

        for(String st : str){  // for each loop
            System.out.println(st);
        }
    }
}
*/

/*
import java.util.Scanner;

class string{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
*/

/*
import java.util.Scanner;

class string{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string :");
        String str = sc.next();

        for(int i = str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }
}
*/

/*
class string{
    public static void main(String[] args){
        String str1 = "Adarsh";
        String str2 = "Adarsh";
        System.out.println(str1 == str2);
    }
}
*/

/*
class string {
    public static void main(String[] args){
        String str1 = new String("Adarsh");
        String str2 = new String("Adarsh");
        System.out.println(str1 == str2);
    }
}
*/

