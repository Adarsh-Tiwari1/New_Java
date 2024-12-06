// compile time pe stack me memory jati hai.
// new keyword se memory heap me jati hai.// 
// scp only String ke liye hota hai.
// new keyword use nahi karge to heap me object nahi banta hai.
// her objrct ke unik reference banta hai. jo kabhi same nahi ho sakta.
// String me == operator false deta hai.
// heap me kabhi ve reference same nahi ho sakta hai but scp me reference same ho sakta hai.
// equal method data comparision karta hai.
// first preference heap me search karta hai.

// String str = "Rewa"; // only object create scp
// String str1 = new String ("Rewa"); // two object heap and scp

/*
class String2{
    public static void main(String[] args){
        String str = new String("Rewa"); // object create hcp and heap 
        String str1 = new String("Rewa");

        System.out.println(str == str1);
        System.out.println(str.equals(str1));
    }
}
*/

// scp only for  String me work karti hai.

/*
class String2{
    public static void main(String[] args){
        String str = "Rewa"; // only object create scp
        String str1 = "Rewa"; 

        System.out.println(str == str1);
        System.out.println(str.equals(str1));
    }
}
*/

// String Constant pool only String ke liye hai.
/*
class String2{
    public static void main(String[] args){
        String str = new String ("Rewa"); 
        String str1 = "Rewa"; 

        System.out.println(str == str1);
        System.out.println(str.equals(str1));
    }
}
*/

/*
class String2{
    public static void main(String[] args){
        String str = new String ("Rewa"); 
        String str1 = "Rewa"; 
        String str3 = str;
        System.out.println(str == str3); // pahle reference heap ko deta hai.
        System.out.println(str.equals(str1));
    }
}
*/


// contains() method 

class String2{
    public static void main(String[] args){
        String str = "ThIS is city of lake";
        boolean b = str.contains("IS");
        System.out.println(b);
    }
}
