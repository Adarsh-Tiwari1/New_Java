
// Upper Case Or Not .
/*
import java.util.Scanner;

class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Any String : ");
        String str = sc.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') { // Corrected the comparison
                count++;
            }
        }

        if (count == str.length()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
*/


// trim() method : Start and Last Space Remove
/*
import java.util.Scanner;

class String5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String :" );
        String str = " Hello Java ";
        System.out.println("Length of String before trim " + str.length());
        String str1 = str.trim();
        System.out.println("Length of String Afger trim " + str1.length());
    }
}
*/


// join() method

class String5{
    public static void main(String[] args){
        
        System.out.println("Enter String : ");
        String str = "Welcome To Bhopal";
        String arr[] = str.split(" ");
        String str1 = String.join(" | ",arr);
        System.out.println(str1);
    }
}