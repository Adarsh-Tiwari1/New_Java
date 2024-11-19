
/*
class NumPattern4{
    public static void main(String[] args){
        int n = 0;
        for(int r=1;r<=5;r++){
            for(int c=1;c<=r;c++){
                n++;
                System.out.print(n + " ");
            }
                System.out.println();
        }
    }
}
*/




















class NumPattern4{
    public static void main(String[] args){
        int n = 0;
        for(int r=1;r<=5;r++){
            for(int c=1;c<=r;c++){
                n++;
                System.out.print((char) (64+n) + " ");
            }
                System.out.println();
        }
    }
}