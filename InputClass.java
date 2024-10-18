
class InputClass{
    public static void main(String[] args){
        java.util.Scanner obj = new java.util.Scanner(System.in);  // inline input method
        int num1 = obj.nextInt();
        float num2 = obj.nextFloat();
        System.out.println(num1 + num2);
    }
}
