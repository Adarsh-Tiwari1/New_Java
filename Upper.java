
import java.util.Scanner;

class Upper{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Any Character");
        char ch = sc.next().charAt(0);
        if(ch >= 'A'){   // 
            if(ch <= 'Z'){
                System.out.println("Upper Case");
            }else{
                System.out.println("Lower case");
            }
        } 
        else
        {
            System.out.print("Hello");
        if (ch >= 'a' ){  
            
            if(ch <= 'z'){  
                System.out.println("Lower Case");
            }
        }
        }
    }
}
       