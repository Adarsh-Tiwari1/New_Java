
class Pattern{
    public static void main(String[] args){
    for(int r=1;r<=5;r++){
        for(int j=1;j<=5;j++){
            System.out.print("* "); // Time complexity : loop ke under loop : Bigo(n)square
        }
        System.out.println(""); 
    }
    }
}