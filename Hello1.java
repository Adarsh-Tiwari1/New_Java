/*
class Hello1{
    public static void main(String[] args){
        System.out.println("Ram");
        ;;;;;;;;;;;;;;
        System.out.println("Ram-Sita");;;
    }
}
*/

/*
class Hello1 {
    public static void main(String[] args) {
        printNumbers(1);
    }
    public static void printNumbers(int i) {
        if (i <= 100) { // Base condition to stop recursion
            System.out.println(i);
            printNumbers(i + 1); // Recursive call with the next number
        }
    }
}
*/


/*
class Hello1{
    public static void main(String[] args){
        int i='a'/'a';
        while(i<='d')
        {
            System.out.println(i);
            i++;
        }
    }
}
*/


/*
class Hello1{
    public static void main(String[] args){
        String str = "123";
        String str2 = "456";

        int result = Integer.parseInt();
        result = Integer.parseInt();
        System.out.println(result);
    }
}
*/

/*
class Hello1{ 
    public static void main(String[] args){ 
        String str = "26";
        String str2 = "50"; 
        int result = Integer.parseInt(str); 
        int result2 = Integer.parseInt(str2); 
        int mini = result+result2; 
        System.out.println(mini); 
        String adar = Integer.toString(mini); 
        System.out.println(adar);
    }
}
*/


/*
class Hello1{
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            if(i%10==3){
                System.out.println(i);
            }
        }
    }
}
*/

/*
class Hello1{
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            if(i/10==3 || i%10==3){
                System.out.println(i);
            }
        }
    }
}
*/


import java.util.Scanner;

public class CheckForThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String numberStr = Integer.toString(number);

        if (numberStr.contains("3")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}

















