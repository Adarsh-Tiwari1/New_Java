
import javax.swing.*;
class Swap5{
    public static void main(String[] args){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter 1st number"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter 2nd number"));
        a = a+b; 
        b = a-b; 
        a = a-b;
        System.out.println("a : " + a);
        System.out.println("b : " + b);

    }
}