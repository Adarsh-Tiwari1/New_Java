
import javax.swing.*;
class InputClass2{
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name");
        System.out.println(name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        System.out.println(age);
    }
}