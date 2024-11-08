
import java.util.Scanner;

class NestedIfElse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Any Character");
        char ch = sc.next().charAt(0);
        if(ch >= 'a'){
            if(ch <= 'z'){
                System.out.println("Lower Case");
            }
        } else if (ch >= 'A' ){
            if(ch <= 'Z'){
                System.out.println("Upper Case");
            }
        }
    }
}


/*
import java.util.Scanner;

class NestedIfElse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Any Character");
        char ch = sc.next().charAt(0);
        if(ch >= 'A'){   // ASCII value 65 
            if(ch <= 'Z'){  // ASCII value 90 
                System.out.println("Upper Case");
            }
        } else if (ch >= 'a' ){  // ASCII value 97
            if(ch <= 'z'){   // ASCII value 122
                System.out.println("Lower Case");
            }
        }
    }
}
*/