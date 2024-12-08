// indexOf() // Left to Right Working
/*
class String3{
    public static void main(String[] args){
        String str = "Welcome";
        int i = str.indexOf("e");
        int j = str.indexOf("e", i+1);
        int k = str.indexOf("me");
        int m = str.indexOf("zee");

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
    }
}
*/

// lastIndexOf() Method // last occurence of the String position
/*
class String3{
    public static void main(String[] args){
        String str = "Welcome";
        int i = str.lastIndexOf("e");
        int j = str.lastIndexOf("e",5);
        int k = str.lastIndexOf("me");
        int m = str.lastIndexOf("zee");

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
    }
}
*/

// length() Method 
/*
class String3{
    public static void main(String[] args){
        String str = "Welcome";
        String str1 = "a b c ";
        int len = str.length();
        int len1 = str1.length();
        System.out.println(len);
        System.out.println(len1);
    }
}
*/

/*
class String3{
    public static void main(String[] args){
        String str = "Welcome";
        String str1 = "a b c ";
        int len = str.length();
        int len1 = str1.length();
        System.out.println(len);
        System.out.println(len1);
    }
}
*/

// split() method // 
/*
class String3{
    public static void main(String[] args){
        String str = "Welcome to Bhopal";
        String arr[] = str.split("o");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }
}
*/

/*
class String3{
    public static void main(String[] args){
        String str = "Welcome to Bhopal";
        String arr[] = str.split("o");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }
}
*/

// subString() method  { Start Include end Exclude }
class String3{
    public static void main(String[] args){
        String str = "Welcome to Bhopal"; 
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,5));
    }
}