/*
class AdvPattern1 {
    public static void main(String[] args) {
        for (int r = 1; r <= 5; r++) {           
            for (int c = 1; c <= r; c++) {               
                System.out.print((r + c) % 2);
            }            
            System.out.println();
        }
    }
}
*/

/*
class AdvPatern1{
    public static void main(String[] args){
        int r,c;
        for(r=1;r<=5;r++){
            for(c=5;c>r;c--){
                System.out.print(" ");
            }
            for(c=1;c<=2*r-1;c++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
*/


class AdvPatern1{
    public static void main(String[] args){
        int r,c;
        for(r=1;r<=5;r++){
            for(c=5;c>r;c--){
                System.out.print(" ");
            }
            for(c=1;c<=2*r-1;c++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(r=4;r>=1;r--){
            for(c=5;c>r;c--){
                System.out.print(" ");
            }
            for(c=1;c<=2*r-1;c++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}