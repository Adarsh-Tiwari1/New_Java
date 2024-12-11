/*
import java.util.Scanner;

class StringHomeWork {
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            count++;
            if(count==str.length()){
                if(ch >= 'A' && ch <= 'Z'){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
            }
        }
        
    }
}
*/



import java.util.Scanner;

class StringHomeWork {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
                if(ch >= 'A' && ch <= 'Z'){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }       
    }
}


