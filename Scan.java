/*
class Scan{
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1);
        System.out.println(num2);
    }
}
*/


/*
import java.util.Scanner;
              // Scanner is already defined in this compilation unit
class Scan{  // Scanner Naam Ke Class Hum Nahi Bna Sakte Hai.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        System.out.println(num1);
        System.out.println(num2);
    }
}
*/


/*
class Scan{
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1);
        System.out.println(num2);
    }
}
*/


/*
 import java.io.*;
 class Scan{
 public static void main(String args[]) throws 
IOException{
 BufferedReader br=new BufferedReader(new 
InputStreamReader(System.in));
 System.out.println("Enter Any Character : ");
 char c=br.readLine().charAt(0);
if(c=='a'||c=='i'||c=='o'||c=='u'||c=='e'||c=='A'||c=='I'||
 c=='O'||c=='U'||c=='E'){
 System.out.println("This is Vowel");
 }
 else{
 System.out.println("This is Not a vowel");
 }
 }
 }
 */


// BufferedReader में nextInt() method नहीं होता है। BufferedReader में input हमेशा string के रूप में आता है, जिसे integer में बदलने के लिए Integer.parseInt() का उपयोग करना होगा।

/* // error
import java.io.*;

class Scan{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Entre Any Number");
        int num1 = br.nextInt();

        System.out.println("Entre Any Number");
        int num2 = br.nextInt();

        System.out.println(num1 + num2);
    }
}
*/


/*
import java.io.*;

class Scan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Any Number");
        int num1 = Integer.parseInt(br.readLine()); // readLine() से input लेकर integer में convert किया

        System.out.println("Enter Any Number");
        int num2 = Integer.parseInt(br.readLine()); // readLine() से input लेकर integer में convert किया

        System.out.println("Sum: " + (num1 + num2));
    }
}
*/

/*
import java.io.*;

class Scan{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        System.out.println(num1 + num2);
    }
}
*/


/*
import javax.swing.*;

public class Scan {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        System.out.println(name);
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter 1st num"));
        System.out.println(num);
    }
}
*/


/*
import javax.swing.*;

class Scan{
    public static void main(String[] args){

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter 1st Number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter 1st Number"));
        System.ou.println(num1 + num2);
    }
}
*/

/*
import javax.swing.*;

class Scan{
    public static void main(String[] args){

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter 1st Number"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter 2nd Number"));
        
        System.out.println(num1 + num2);
    }
}
*/